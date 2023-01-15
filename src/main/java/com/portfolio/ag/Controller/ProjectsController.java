package com.portfolio.ag.Controller;

import com.portfolio.ag.Dto.ProjectsDto;
import com.portfolio.ag.Entity.Projects;
import com.portfolio.ag.Security.Controller.Message;
import com.portfolio.ag.Service.ProjectsService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
@CrossOrigin(origins = {"http://localhost:4200", "https://zurc-portfolio.web.app"})
public class ProjectsController {
    @Autowired
    ProjectsService projectsService;
    
    @GetMapping("/list")
    public ResponseEntity<List<Projects>> list(){
        List<Projects> list = projectsService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/details/{id}")
    public ResponseEntity<Projects> getById(@PathVariable("id") int id){
        if(!projectsService.existsById(id))
            return new ResponseEntity(new Message("Project doesn't exist"), HttpStatus.NOT_FOUND);
        Projects projects = projectsService.getOne(id).get();
        return new ResponseEntity(projects, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!projectsService.existsById(id)) {
            return new ResponseEntity(new Message("Project doesn't exist"), HttpStatus.NOT_FOUND);
        }
        projectsService.delete(id);
        return new ResponseEntity(new Message("Project deleted succesfully"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ProjectsDto projectsDto){      
        if(StringUtils.isBlank(projectsDto.getProjectName()))
            return new ResponseEntity(new Message("ProjectName is mandatory"), HttpStatus.BAD_REQUEST);
        if(projectsService.existsByProjectName(projectsDto.getProjectName()))
            return new ResponseEntity(new Message("Project exists"), HttpStatus.BAD_REQUEST);
        
        Projects projects = new Projects(projectsDto.getProjectName(), projectsDto.getProjectInfo(), projectsDto.getProjectDate(), projectsDto.getProjectSource(), projectsDto.getProjectImg());
        projectsService.save(projects);
        
        return new ResponseEntity(new Message("Project added succesfully"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody ProjectsDto projectsDto){
        if(!projectsService.existsById(id))
            return new ResponseEntity(new Message("ID doesn't exist"), HttpStatus.BAD_REQUEST);
        if(projectsService.existsByProjectName(projectsDto.getProjectName()) && projectsService.getByProjectName(projectsDto.getProjectName()).get().getId() != id)
            return new ResponseEntity(new Message("Project already exists"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(projectsDto.getProjectName()))
            return new ResponseEntity(new Message("ProjectName is mandatory"), HttpStatus.BAD_REQUEST);
        
        Projects projects = projectsService.getOne(id).get();
        projects.setProjectName(projectsDto.getProjectName());
        projects.setProjectInfo((projectsDto.getProjectInfo()));
        projects.setProjectDate(projectsDto.getProjectDate());
        projects.setProjectSource(projectsDto.getProjectSource());
        projects.setProjectImg(projectsDto.getProjectImg());
        
        projectsService.save(projects);
        return new ResponseEntity(new Message("Project updated succesfully"), HttpStatus.OK);    
    }
}