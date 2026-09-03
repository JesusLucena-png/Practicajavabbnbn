package com.corporate.talent.hub.repositories;

import com.corporate.talent.hub.interfaces.Create;
import com.corporate.talent.hub.interfaces.Rud;
import com.corporate.talent.hub.models.Employee;

public class EmployeeRepositori implements Create<Employee>, Rud<Double> {

    @Override
    public void create (Employee employee) {
       System.out.println("");
    }
    @Override
    public void read (Double identification) {
        System.out.println("");
    }
    @Override
    public void update (Double identification) {
        System.out.println("");
    }
    @Override
    public void delete (Double identification) {
        System.out.println("");
    }
}
