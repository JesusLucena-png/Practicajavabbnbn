package com.corporate.talent.hub.models;

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

    @Override
    public String toString() {
        return "|Nombre: %-25s |CC: %-12s |Genero: %-3c ".formatted(getName(),getIdentification(),getGenero());
    }
}
