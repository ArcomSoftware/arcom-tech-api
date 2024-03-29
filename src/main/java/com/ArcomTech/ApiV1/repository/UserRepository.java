package com.ArcomTech.ApiV1.repository;

import com.ArcomTech.ApiV1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByName(@Param("name") String name);
}
