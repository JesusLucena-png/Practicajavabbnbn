package com.corporate.talent.hub.models;

public abstract sealed class Employee extends Person permits Developer, Manager{

    private Double salary;

    public Employee(String fullName, String identification, char gender, Double salary) {
        super(fullName, identification, gender);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "|Salario: $%-12.2f ".formatted(getSalary());
    }
}
