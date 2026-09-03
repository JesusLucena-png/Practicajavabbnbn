package com.corporate.talent.hub.views;

import com.corporate.talent.hub.validations.Validations;

import javax.swing.*;

public class Index {

    public void menu(){

        String options = """
                1. Registrar Empleados
                2. Registrar ConsultorExterno
                """;

        int option = -1;
        while (option != 0){

            String input = JOptionPane.showInputDialog(options);

            if (null == input){close();break;}
            if (!Validations.validateEmpty(input)){continue;}
            if (!Validations.validateStringNumber(input)){ continue;}

            option = Integer.parseInt(input);

            switch (option){
                case 1 -> menu();
                case 2 -> menu();
                default -> option = close();
            }
        }
    }

    public int close(){
        JOptionPane.showMessageDialog(null, "El usuario ha cerrado el sistema. La sesión ha finalizado correctamente.","Sistema cerrado", JOptionPane.INFORMATION_MESSAGE);
        return 0;
    }
}
