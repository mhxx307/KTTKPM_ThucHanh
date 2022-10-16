package com.example.springbootresttemplate.service;

import com.example.springbootresttemplate.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private RestTemplate restTemplate;
    private String crmUrl;

    @Autowired
    public UserServiceImpl(RestTemplate theRestTemplate, @Value("${crm.url.user}") String theCrmUrl) {
        restTemplate = theRestTemplate;
        crmUrl = theCrmUrl;
    }

    @Override
    public void saveUser(User user) {
        int userId = user.getId();
        if (userId == 0) {
            restTemplate.postForEntity(crmUrl, user, String.class);
        } else {
            restTemplate.put(crmUrl, user);
        }
    }

    @Override
    public User getUserById(int id) {
        User user = restTemplate.getForObject(crmUrl + "/" + id, User.class);
        return user;
    }

    @Override
    public void deleteUserById(int id) {
        restTemplate.delete(crmUrl + "/" + id);
    }

    @Override
    public List<User> getAllUsers() {
        ResponseEntity<List<User>> responseEntity = restTemplate.exchange(crmUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<User>>() {});
        List<User> users =  responseEntity.getBody();
        return users;
    }
}
