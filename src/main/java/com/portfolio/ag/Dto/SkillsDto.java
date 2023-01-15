package com.portfolio.ag.Dto;

import javax.validation.constraints.NotBlank;


public class SkillsDto {
    @NotBlank
    private String skill;
    @NotBlank
    private int percentage;
    @NotBlank
    private String skillImg;
    
    //Constructors
    public SkillsDto() {
    }

    public SkillsDto(String skill, int percentage, String skillImg) {
        this.skill = skill;
        this.percentage = percentage;
        this.skillImg = skillImg;
    }

    //Getters - Setters
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String getSkillImg() {
        return skillImg;
    }

    public void setSkillImg(String skillImg) {
        this.skillImg = skillImg;
    }
}