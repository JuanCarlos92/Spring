package com.juancarlos.curso.springboot.error.springbooterror.services;

import java.util.List;
import java.util.Optional;

import com.juancarlos.curso.springboot.error.springbooterror.models.domain.User;

public interface UserService {

    List<User> findAll();
    Optional<User> findById(Long id);

}
