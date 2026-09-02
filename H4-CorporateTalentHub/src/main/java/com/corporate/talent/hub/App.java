package com.corporate.talent.hub;

import com.corporate.talent.hub.model.Employee;
import com.corporate.talent.hub.model.Person;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    static void main(String[] args) {

        List<Person> personas = new ArrayList<>();

        int exit;

        do {

            exit = -1;

            String input = JOptionPane.showInputDialog(menus(0));
            if (null == input || input.isBlank()) {
                break;
            }
            int opcion = Integer.parseInt(input);

            if (opcion == 0) {
                exit = 0;
            } else if (opcion == 1) {
                create(1, personas);
            } else if (opcion == 2) {
                create(2, personas);
            }else{
                System.out.println("123123");
            }

        }while (exit != 0);

    }

    public static String create(int code, List<Person> person){

        if (code == 1){
            person.add(createEmployee());
            JOptionPane.showMessageDialog(null, "Employee successfully created.");
        }

        return "This Makes No Sense";
    }

    public static Employee createEmployee(){

        String fullName;
        String identification;
        char gender;
        Double salary;
        String jobPosition;

        while (true) {
            String input = JOptionPane.showInputDialog("Enter full name");
            if (null == input || input.isBlank()){
                JOptionPane.showMessageDialog(null, "Please enter your full name.");
                continue;
            }
            fullName = input;
            break;
        }

        while (true) {
            String input  = JOptionPane.showInputDialog("Enter identification");
            if (null == input || input.isBlank()){
                JOptionPane.showMessageDialog(null, "Please enter your identification.");
                continue;
            }
            if (!input.matches("\\d+") || input.length() < 6) {
                JOptionPane.showMessageDialog(null, "The identification field only allows numbers and a minimum of 6 characters.");
                continue;
            }
            identification = input;
            break;
        }

        while (true) {
            System.out.print(1);
            String input = JOptionPane.showInputDialog(menus(2)+"\nEnter Gender");
            System.out.print(2);
            if (null == input || input.isBlank()){
                System.out.print(3);
                JOptionPane.showMessageDialog(null, "Please enter your gender.");
                System.out.print(4);
                continue;
            }
            System.out.print(5);
            input = input.toUpperCase();
            System.out.print(6);
            if (!input.equals("M") && !input.equals("F") && !input.equals("O")){
                System.out.print(7);
                JOptionPane.showMessageDialog(null, "The entered gender does not match.");
                System.out.print(8);
                continue;
            }
            System.out.print(9);
            gender = input.charAt(0);
            System.out.print(10);
            break;
        }

        while (true){

            String input = JOptionPane.showInputDialog("Enter salary");

            if (input == null || input.isBlank()) {
                JOptionPane.showMessageDialog(
                        null,
                        "Please enter a salary."
                );
                continue;
            }

            try {
                double salaryInput = Double.parseDouble(input);
                if (salaryInput < 0){
                    JOptionPane.showMessageDialog(null, "Please enter a positive salary.");
                    continue;
                }
                salary = salaryInput;
                break;
            }catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Please enter a valid number."
                );
                continue;
            }
        }

        while (true) {
            String input  = JOptionPane.showInputDialog("Enter job Position");
            if (null == input || input.isBlank()){
                JOptionPane.showMessageDialog(null, "Please enter your identification.");
                continue;
            }
            jobPosition = input;
            break;
        }

        return new Employee(fullName,identification,gender,salary,jobPosition);
    }

    public static String menus(int code){

        String menu = switch (code){
            case 0 -> """
                    =============== Talent Hub / Riwi ===============
                    
                    1. Create Employee
                    2. Create External Consultant
                    
                    _________________________________________________
                    1/2. Create PersonCar !?!
                    
                    _________________________________________________
                    0. Exit
                    ================================================= 
                    """;
            case 1 -> """
                    =============== !?! PersonCar !?! ===============
                    
                    1. Start The PersonCar
                    2. Accelerate The PersonCar
                    3. Honk The PersonCar Horn
                    _________________________________________________
                    0. Exit
                    ================================================= 
                    """;
            case 2 -> """
                    =============== ===============
                    1. M = Masculino
                    2. F = Femenino
                    3. O = Otro
                    ===============================
                    """;
            default -> "This Makes No Sense";
        };

        return menu;

    }
}
