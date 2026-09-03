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


}
