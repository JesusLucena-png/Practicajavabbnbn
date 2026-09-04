package com.corporate.talent.hub.views;

import com.corporate.talent.hub.validations.Validations;

import javax.swing.*;

public class Index {

    private final EmployeeView employeeView;

    public Index(EmployeeView employeeView) {
        this.employeeView = employeeView;
    }

    public void menu(){

        String options = """
                1. Registrar Desarrollador
                2. Registrar Gerente
                3. Registrar ConsultorExterno
                4. Ver Empleados
                """;

        int option = -1;
        while (option != 0){

            String input = (String)
                    JOptionPane.showInputDialog(
                            null,
                            options,
                            "Talento Hub",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            null,
                            null
                    );

            if (null == input){ input = "0";}
            if (!Validations.validateEmpty(input)){continue;}
            if (!Validations.validateStringNumber(input)){ continue;}

            option = Integer.parseInt(input);

            if (option != 0) {
                switch (option) {
                    case 1 -> employeeView.createDeveloper();
                    case 2 -> employeeView.createManager();
                    case 3 -> employeeView.createExternalConsultant();
                    case 4 -> employeeView.viewEmployees();
                    default -> System.out.println();
                }
            }else {
                JOptionPane.showMessageDialog(
                        null,
                        """
                        El usuario ha cerrado el sistema. 
                        La sesión ha finalizado correctamente.""",
                        "Sistema cerrado",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

        }
    }

}
