package com.portfolio.ag.Dto;

import javax.validation.constraints.NotBlank;

public class ProjectsDto {
    @NotBlank
    private String projectName;
    @NotBlank
    private String projectInfo;
    @NotBlank
    private String projectDate;
    @NotBlank
    private String projectSource;
    @NotBlank
    private String projectImg;
    
    //Constructors
    public ProjectsDto() {
    }

    public ProjectsDto(String projectName, String projectInfo, String projectDate, String projectSource, String projectImg) {
        this.projectName = projectName;
        this.projectInfo = projectInfo;
        this.projectDate = projectDate;
        this.projectSource = projectSource;
        this.projectImg = projectImg;
    }
    
    //Getters - Setters
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

    public void setProjectImg(String projectImg) {
        this.projectImg = projectImg;
    }
}