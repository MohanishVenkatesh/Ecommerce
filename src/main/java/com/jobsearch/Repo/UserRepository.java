package com.jobsearch.Repo;

import com.jobsearch.Pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {


    Optional<User> findByEmail(String email);

}
