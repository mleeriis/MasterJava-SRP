package com.riis;

import com.riis.controller.ClientModule;
import com.riis.model.Employee;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John Doe", "IT", false);
        ClientModule clientModule = new ClientModule("Employees");

        clientModule.hireNewEmployee(emp1);
        System.out.println("**********************************");
        clientModule.printEmployeeReport(emp1, "csv");
        System.out.println("**********************************");
        clientModule.printEmployeeReport(emp1, "xml");
        System.out.println("**********************************");
        clientModule.terminateEmployee(emp1);




    }
}
