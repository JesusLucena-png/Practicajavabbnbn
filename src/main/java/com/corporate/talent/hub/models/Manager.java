package com.corporate.talent.hub.models;

public final class Manager extends Employee{

    private double monthlyBudget;

    public Manager(String fullName, String identification, char gender, Double salary, double monthlyBudget) {
        super(fullName, identification, gender, salary);
        this.monthlyBudget = monthlyBudget;
    }

    public double getMonthlyBudget() {
        return monthlyBudget;
    }

    public void setMonthlyBudget(double monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }

    @Override
    public String toString() {
        return super.toString() + "Presupuesto: $%-20f.2 ".formatted(getMonthlyBudget());
    }
}
