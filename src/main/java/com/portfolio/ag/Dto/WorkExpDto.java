package com.portfolio.ag.Dto;

import javax.validation.constraints.NotBlank;

public class WorkExpDto {
    @NotBlank
    private String workName;
    @NotBlank
    private String workInfo;
    @NotBlank
    private String workDate;
    @NotBlank
    private String workImg;
    
    //Constructors
    public WorkExpDto() {
    }

    public WorkExpDto(String workName, String workInfo, String workDate, String workImg) {
        this.workName = workName;
        this.workInfo = workInfo;
        this.workDate = workDate;
        this.workImg = workImg;
    }
    
    //Getters - Setters
    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkInfo() {
        return workInfo;
    }

    public void setWorkInfo(String workInfo) {
        this.workInfo = workInfo;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getWorkImg() {
        return workImg;
    }

    public void setWorkImg(String workImg) {
        this.workImg = workImg;
    }
}