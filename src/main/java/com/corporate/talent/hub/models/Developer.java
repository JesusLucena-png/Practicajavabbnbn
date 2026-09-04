package com.corporate.talent.hub.models;

public final class Developer extends Employee{

    private String mainLanguage;

    public Developer(String fullName, String identification, char gender, Double salary, String mainLanguage) {
        super(fullName, identification, gender, salary);
        this.mainLanguage = mainLanguage;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    @Override
    public String toString() {
        return super.toString() + "|Lenguaje: %-15s |".formatted(getMainLanguage());
    }
}
