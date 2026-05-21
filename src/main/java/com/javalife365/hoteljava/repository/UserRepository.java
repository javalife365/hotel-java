package com.javalife365.hoteljava.repository;

import com.javalife365.hoteljava.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {


    boolean existByEmail(String email);

    Optional<User> findByEmail(String email);



}
