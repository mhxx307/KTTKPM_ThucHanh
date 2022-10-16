package com.example.springbootcruddb.repository;

import com.example.springbootcruddb.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}

