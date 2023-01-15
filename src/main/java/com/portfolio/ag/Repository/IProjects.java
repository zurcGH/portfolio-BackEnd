package com.portfolio.ag.Repository;

import com.portfolio.ag.Entity.Projects;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjects extends JpaRepository<Projects, Integer>{
    public Optional<Projects> findByProjectName(String projectName);
    public boolean existsByProjectName(String projectName);
}