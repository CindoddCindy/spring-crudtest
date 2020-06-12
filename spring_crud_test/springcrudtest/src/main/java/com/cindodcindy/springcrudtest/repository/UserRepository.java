package com.cindodcindy.springcrudtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cindodcindy.springcrudtest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}

