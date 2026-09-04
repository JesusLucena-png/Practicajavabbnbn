package com.corporate.talent.hub.controllers;

import com.corporate.talent.hub.models.Developer;
import com.corporate.talent.hub.models.ExternalConsultant;
import com.corporate.talent.hub.models.Manager;
import com.corporate.talent.hub.models.Person;
import com.corporate.talent.hub.services.EmployeeService;
import com.corporate.talent.hub.validations.Validations;

import java.util.List;


public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void createDeveloper(Developer developer){
        employeeService.createDeveloper(developer);
    }

    public void createManager(Manager manager){
        employeeService.createManager(manager);
    }

    public void createExternalConsultant(ExternalConsultant externalConsultant){
        employeeService.createExternalConsultant(externalConsultant);
    }

    public List<Person> getEmployees(){
        return employeeService.getEmployees();
    }
}
