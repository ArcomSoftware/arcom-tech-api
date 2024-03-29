package com.ArcomTech.ApiV1.repository;

import com.ArcomTech.ApiV1.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
