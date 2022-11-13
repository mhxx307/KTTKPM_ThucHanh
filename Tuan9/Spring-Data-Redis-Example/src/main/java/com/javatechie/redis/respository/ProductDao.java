package com.javatechie.redis.respository;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.javatechie.redis.entity.Product;

@Repository
public class ProductDao {

	private static final String HASH_KEY = "Product";

	@SuppressWarnings("rawtypes")
	@Autowired
	private RedisTemplate template;

	private HashOperations<String, Integer, Product> hashOperations;

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() {
		hashOperations = template.opsForHash();
	}

	public Product save(Product product) {
		hashOperations.put(HASH_KEY, product.getId(), product);
		return product;
	}

	public List<Product> findAll() {
		return hashOperations.values(HASH_KEY);
	}

	public Product findProductById(int id) {
		return hashOperations.get(HASH_KEY, id);
	}

	public String deleteProduct(int id) {
		hashOperations.delete(HASH_KEY, id);

		return "product removed !!";
	}

}
