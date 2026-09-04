package com.corporate.talent.hub.views;

import com.corporate.talent.hub.controllers.EmployeeController;
import com.corporate.talent.hub.models.*;
import com.corporate.talent.hub.validations.Validations;

import javax.swing.*;
import java.util.Locale;

public class EmployeeView{

    private final EmployeeController employeeController;

    public EmployeeView(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }

    public void createDeveloper(){

        String fullName = "";
        String identification = "";
        char gender = '-';
        double salary = 0.0;

        while (true) {
            fullName
                    = JOptionPane.showInputDialog(null, "Ingresa el nombre completo:"
            );
            if (null == fullName) {return;}
            if (!Validations.validateStringString(fullName)) {continue;}
            if (!Validations.validateFullName(fullName)) {continue;}
            break;
        }

        while (true) {
            identification
                    = JOptionPane.showInputDialog(null, "Ingresa el número de identificación:"
            );
            if (null == identification) {return;}
            if (!Validations.validateIdentification(identification)){continue;}
            break;
        }

        while (true) {
            String inputGener
                    = JOptionPane.showInputDialog(null, "Ingresa el género (M/F/O):");
            if (null == inputGener) {return;}
            inputGener = inputGener.toUpperCase();
            gender = inputGener.charAt(0);
            if (!Validations.validateGender(gender)){continue;}
            break;
        }

        while (true) {
             String inputSalary
                    = JOptionPane.showInputDialog(null, "Ingresa el salario:");
            if (null == inputSalary) {return;}
            if (!Validations.validateStringNumber(inputSalary)) {continue;}
            salary = Double.parseDouble(inputSalary);
            if (!Validations.validatePositive(salary)) {continue;}
            break;
        }

        String mainLenguage
                = JOptionPane.showInputDialog(null, "Ingresa el lenguaje de programación principal:");
        if (null == mainLenguage){return;}

        employeeController.createDeveloper(
                new Developer(
                        fullName,
                        identification,
                        gender,
                        salary,
                        mainLenguage
                ));

    }

    public void createManager(){

        String fullName = "";
        String identification = "";
        char gender = '-';
        double salary = 0.0;
        double monthlyBudget = 0.0;

        while (true) {
            fullName
                    = JOptionPane.showInputDialog(null, "Ingresa el nombre completo:");
            if (null == fullName) {return;}
            if (!Validations.validateStringString(fullName)) {continue;}
            if (!Validations.validateFullName(fullName)) {continue;}
            break;
        }

        while (true) {
            identification
                    = JOptionPane.showInputDialog(null, "Ingresa el número de identificación:");
            if (null == identification) {return;}
            if (!Validations.validateIdentification(identification)){continue;}
            break;
        }

        while (true) {
            String inputGener
                    = JOptionPane.showInputDialog(null, "Ingresa el género (M/F/O):");
            if (null == inputGener) {return;}
            inputGener = inputGener.toUpperCase();
            gender = inputGener.charAt(0);
            if (!Validations.validateGender(gender)){continue;}
            break;
        }

        while (true) {
            String inputSalary
                    = JOptionPane.showInputDialog(null, "Ingresa el salario:");
            if (null == inputSalary) {return;}
            if (!Validations.validateStringNumber(inputSalary)) {continue;}
            salary = Double.parseDouble(inputSalary);
            if (!Validations.validatePositive(salary)) {continue;}
            break;
        }

        while (true) {
            String inputMonthlyBudget
                    = JOptionPane.showInputDialog(null, "Ingresa el presupuesto mensual:");
            if (null == inputMonthlyBudget) {return;}
            if (!Validations.validateStringNumber(inputMonthlyBudget)) {continue;}
            monthlyBudget = Double.parseDouble(inputMonthlyBudget);
            if (!Validations.validatePositive(monthlyBudget)) {continue;}
            break;
        }

        employeeController.createManager(
                new Manager(fullName,
                        identification,
                        gender,
                        salary,
                        monthlyBudget
                ));
    }

    public void createExternalConsultant(){

        String fullName = "";
        String identification = "";
        char gender = '-';

        while (true) {
            fullName
                    = JOptionPane.showInputDialog(null, "Ingresa el nombre completo:");
            if (null == fullName) {return;}
            if (!Validations.validateStringString(fullName)) {continue;}
            if (!Validations.validateFullName(fullName)) {continue;}
            break;
        }

        while (true) {
            identification
                    = JOptionPane.showInputDialog(null, "Ingresa el número de identificación:");
            if (null == identification) {return;}
            if (!Validations.validateIdentification(identification)){continue;}
            break;
        }

        while (true) {
            String inputGener
                    = JOptionPane.showInputDialog(null, "Ingresa el género (M/F/O):");
            if (null == inputGener) {return;}
            inputGener = inputGener.toUpperCase();
            gender = inputGener.charAt(0);
            if (!Validations.validateGender(gender)){continue;}
            break;
        }

        String company
                = JOptionPane.showInputDialog(null, "Ingresa el nombre de la empresa:");
        if (null == company){return;}

        String jobPosition
                = JOptionPane.showInputDialog(null, "Ingresa el puesto:");
        if (null == jobPosition){return;}

        employeeController.createExternalConsultant(
                new ExternalConsultant(
                        fullName,
                        identification,
                        gender,
                        company,
                        jobPosition
                ));
    }

    public void viewEmployees(){
        for (Person employee : employeeController.getEmployees()) {
          System.out.println(employee);
        }
    }
}
