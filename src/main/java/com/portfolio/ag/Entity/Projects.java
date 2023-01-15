package com.portfolio.ag.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String projectName;
    private String projectInfo;
    private String projectDate;
    private String projectSource;
    private String projectImg;
    
    //Constructors
    public Projects() {
    }

    public Projects(String projectName, String projectInfo, String projectDate, String projectSource, String projectImg) {
        this.projectName = projectName;
        this.projectInfo = projectInfo;
        this.projectDate = projectDate;
        this.projectSource = projectSource;
        this.projectImg = projectImg;
    }
    
    //Getters - Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(String projectInfo) {
        this.projectInfo = projectInfo;
    }
    
    public String getProjectDate() {
        return projectDate;
    }

    public void setProjectDate(String projectDate) {
        this.projectDate = projectDate;
    }
    
    public String getProjectSource() {
        return projectSource;
    }

    public void setProjectSource(String projectSource) {
        this.projectSource = projectSource;
    }
    
    public String getProjectImg() {
        return projectImg;
    }

    public void setProjectImg(String img) {
        this.projectImg = img;
    }
}