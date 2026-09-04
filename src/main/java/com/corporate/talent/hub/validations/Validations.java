package com.corporate.talent.hub.validations;

import javax.swing.*;

public class Validations {

    public static boolean validateEmpty(String input){
        if (input.isBlank()){
            JOptionPane.showMessageDialog(
                    null,
                    "El campo no puede estar vacío",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
        return true;
    }

    public static boolean validateStringNumber(String input){
        if (!input.matches("\\d+")){
            JOptionPane.showMessageDialog(
                    null,
                    "El campo solo permite números",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
        return true;
    }
    public static boolean validateStringString(String input){
        if (!input.matches("^[\\p{L}]+(?:[ '-][\\p{L}]+)*$")){
            JOptionPane.showMessageDialog(
                    null,
                    "El campo solo permite letras",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
        return true;
    }

    public static boolean validateStringSpaces(String input, int quantityMin, int quantityMax , String message){
        input = input.trim();
        long spaces = input.chars()
                .filter(c -> c == ' ')
                .count();
        if (spaces < quantityMin || spaces > quantityMax){
            JOptionPane.showMessageDialog(
                    null,
                    message,
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
        return true;
    }

    public static boolean validateFullName(String input){

        if (!validateEmpty(input)){return false;}
        if (!validateStringSpaces(
                input,
                1,
                100,
                "Tienes que ingresar su nombre completo"
        )){return false;}

        String[] palabras = input.trim().split("\\s+");
        if (palabras.length > 10){
            JOptionPane.showMessageDialog(
                    null,
                    "Tienes que ingresar su nombre completo",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }

        return true;
    }

    public static boolean validateIdentification(String input){
        if (!validateEmpty(input)){return false;}
        if (!validateStringNumber(input)){return  false;}
        return true;
    }

    public static boolean validatePositive(double input){
        if (input <= 0){
            return false;
        }
        else return true;
    }

    public static boolean validateGender(char input){
        char[] genders = {'M', 'F', 'O'};
        if (input == ' '){return false;}
        for (char gender : genders){
            if (gender == input){
                return true;
            }
        }
        JOptionPane.showMessageDialog(
                null,
                "El genero no fue ifentificado",
                "Error",
                JOptionPane.ERROR_MESSAGE
        );
        return false;
    }
}
