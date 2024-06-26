package com.Corboncell.AuthAPIService.repository;

import com.Corboncell.AuthAPIService.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);

}
