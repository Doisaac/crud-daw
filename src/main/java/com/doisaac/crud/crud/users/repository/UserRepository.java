package com.doisaac.crud.crud.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doisaac.crud.crud.users.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  
}
