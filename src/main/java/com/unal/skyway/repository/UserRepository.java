package com.unal.skyway.repository;

import com.unal.skyway.models.Role;
import com.unal.skyway.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User,String> {
    User findByCorreo(String correo);
    User findUserByIdentificacion(String identificacion);
    User deleteUserByCorreo(String correo);
}
