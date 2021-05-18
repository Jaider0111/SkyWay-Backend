package com.unal.skyway.repository;

import com.unal.skyway.models.Role;
import com.unal.skyway.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User,String> {
    User findUserByEmail(String email);
    User findUserByIdentification(String identification);
    User deleteUserByEmail(String email);
}
