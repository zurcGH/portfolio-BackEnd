package com.portfolio.ag.Service;

import com.portfolio.ag.Entity.Projects;
import com.portfolio.ag.Repository.IProjects;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProjectsService {
     @Autowired
     IProjects iprojects;
     
     public List<Projects> list(){
         return iprojects.findAll();
     }
     
     public Optional<Projects> getOne(int id){
         return iprojects.findById(id);
     }
     
     public Optional<Projects> getByProjectName(String projectName){
         return iprojects.findByProjectName(projectName);
     }
     
     public void save(Projects projects){
         iprojects.save(projects);
     }
     
     public void delete(int id){
         iprojects.deleteById(id);
     }
     
     public boolean existsById(int id){
         return iprojects.existsById(id);
     }
     
     public boolean existsByProjectName(String projectName){
         return iprojects.existsByProjectName(projectName);
     }
}