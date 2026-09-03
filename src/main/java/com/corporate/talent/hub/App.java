package com.corporate.talent.hub;

import com.corporate.talent.hub.models.Employee;
import com.corporate.talent.hub.models.Person;
import com.corporate.talent.hub.validations.Validations;
import com.corporate.talent.hub.views.Index;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    static void main(String[] args) {

        Index indexView
                = new Index();

        indexView.menu();

    }
}
