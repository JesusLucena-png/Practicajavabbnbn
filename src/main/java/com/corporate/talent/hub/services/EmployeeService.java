package com.corporate.talent.hub.services;

import com.corporate.talent.hub.models.Developer;
import com.corporate.talent.hub.models.ExternalConsultant;
import com.corporate.talent.hub.models.Manager;
import com.corporate.talent.hub.models.Person;
import com.corporate.talent.hub.repositories.EmployeeRepositori;

import java.util.List;

public class EmployeeService {

    private final EmployeeRepositori employeeRepositori;

    public EmployeeService(EmployeeRepositori employeeRepositori) {
        this.employeeRepositori = employeeRepositori;
    }

    public void createDeveloper(Developer developer){
        employeeRepositori.createDeveloper(developer);
    }

    public void createManager(Manager manager){
        employeeRepositori.createManager(manager);
    }

    public void createExternalConsultant(ExternalConsultant externalConsultant){
        employeeRepositori.createExternalConsultant(externalConsultant);
    }

    public List<Person> getEmployees(){
        return employeeRepositori.getEmployees();
    }
}
