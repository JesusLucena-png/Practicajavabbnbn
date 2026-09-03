package com.corporate.talent.hub.models;

public final class Employee extends Person{

    private Double salary;
    private String jobPosition;

    public Employee(String fullName, String identification, char gender, Double salary, String jobPosition) {
        super(fullName, identification, gender);
        this.salary = salary;
        this.jobPosition = jobPosition;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }
}
