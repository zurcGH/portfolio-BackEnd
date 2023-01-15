package com.portfolio.ag.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Studies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String studyName;
    private String studyInfo;
    private String studyDate;
    private String studyImg;
    
    //Constructors
    public Studies() {
    }

    public Studies(String studyName, String studyInfo, String studyDate, String studyImg) {
        this.studyName = studyName;
        this.studyInfo = studyInfo;
        this.studyDate = studyDate;
        this.studyImg = studyImg;
    }
    
    //Getters - Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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