package com.corporate.talent.hub.repositories;

import com.corporate.talent.hub.interfaces.Create;
import com.corporate.talent.hub.models.*;

import javax.swing.*;
import java.util.List;

public class EmployeeRepositori{

    private List<Person> empleados;

    public EmployeeRepositori(List<Person> empleados) {
        this.empleados = empleados;
    }

    public void createDeveloper(Developer developer){
        empleados.add(developer);
        JOptionPane.showMessageDialog(
                null,
                "¡Empleado registrado exitosamente!",
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );
        JOptionPane.showMessageDialog(null, developer);
    }

    public void createManager(Manager manager){
        empleados.add(manager);
        JOptionPane.showMessageDialog(
                null,
                "¡Empleado registrado exitosamente!",
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );
        JOptionPane.showMessageDialog(null, manager);
    }

    public void createExternalConsultant(ExternalConsultant externalConsultant){
        empleados.add(externalConsultant);
        JOptionPane.showMessageDialog(
                null,
                "¡Empleado registrado exitosamente!",
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );
        JOptionPane.showMessageDialog(null, externalConsultant);
    }

    public List<Person> getEmployees(){
        return empleados;
    }
}
