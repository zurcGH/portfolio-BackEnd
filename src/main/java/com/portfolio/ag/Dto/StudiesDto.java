package com.portfolio.ag.Dto;

import javax.validation.constraints.NotBlank;

public class StudiesDto {
    @NotBlank
    private String studyName;
    @NotBlank
    private String studyInfo;
    @NotBlank
    private String studyDate;
    @NotBlank
    private String studyImg;
    
    //Constructors
    public StudiesDto() {
    }

    public StudiesDto(String studyName, String studyInfo, String studyDate, String studyImg) {
        this.studyName = studyName;
        this.studyInfo = studyInfo;
        this.studyDate = studyDate;
        this.studyImg = studyImg;
    }
    
    //Getters - Setters
    public String getStudyName() {
        return studyName;
    }

    public void setStudyName(String studyName) {
        this.studyName = studyName;
    }

    public String getStudyInfo() {
        return studyInfo;
    }

    public void setStudyInfo(String studyInfo) {
        this.studyInfo = studyInfo;
    }

    public String getStudyDate() {
        return studyDate;
    }

    public void setStudyDate(String studyDate) {
        this.studyDate = studyDate;
    }

    public String getStudyImg() {
        return studyImg;
    }

    public void setStudyImg(String studyImg) {
        this.studyImg = studyImg;
    }
}