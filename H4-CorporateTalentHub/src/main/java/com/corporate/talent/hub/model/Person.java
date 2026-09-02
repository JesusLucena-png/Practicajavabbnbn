package com.corporate.talent.hub.model;

public sealed abstract class Person permits Employee, ExternalConsultant{

    private String fullName;

    private String identification;
    private char gender;

    public Person(String fullName, String identification, char gender) {
        this.fullName = fullName;
        this.identification = identification;
        this.gender = gender;
    }

    public String getName() {
        return fullName;
    }

    public void setName(String name) {
        this.fullName = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public char getGenero() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
