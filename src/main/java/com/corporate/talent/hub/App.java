package com.corporate.talent.hub;

import com.corporate.talent.hub.controllers.EmployeeController;
import com.corporate.talent.hub.models.Person;
import com.corporate.talent.hub.repositories.EmployeeRepositori;
import com.corporate.talent.hub.services.EmployeeService;
import com.corporate.talent.hub.views.EmployeeView;
import com.corporate.talent.hub.views.Index;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    static void main(String[] args) {

        List<Person> employee
                = new ArrayList<>();

        EmployeeRepositori employeeRepositori
                = new EmployeeRepositori(employee);

        EmployeeService employeeService
                = new EmployeeService(employeeRepositori);

        EmployeeController employeeController
                = new EmployeeController(employeeService);

        EmployeeView employeeView
                = new EmployeeView(employeeController);

        Index indexView
                = new Index(
                        employeeView
        );

        indexView.menu();

    }
}
