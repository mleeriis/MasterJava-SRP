package com.riis.controller;

import com.riis.database.DatabaseConnectionManager;
import com.riis.database.EmployeeDAO;
import com.riis.model.Employee;
import com.riis.report.EmployeeReportFormatter;
import com.riis.report.ReportFormatter;

public class ClientModule {
    DatabaseConnectionManager dbConnection;
    EmployeeDAO employeeDAO;

    public ClientModule(String databaseName) {
        this.dbConnection = new DatabaseConnectionManager(databaseName);
        this.employeeDAO = new EmployeeDAO(this.dbConnection);
    }

    public void hireNewEmployee(Employee emp) {
        dbConnection.connect();
        employeeDAO.saveEmployee(emp);
        emp.setWorking(true);
        System.out.println(emp.getName() + " is now working. isWorking() = " + emp.isWorking());
    }

    public void terminateEmployee(Employee emp) {
        dbConnection.connect();
        employeeDAO.deleteEmployee(emp);
        emp.setWorking(false);
        System.out.println(emp.getName() + " is no longer working. isWorking() = " + emp.isWorking());
    }

    public void printEmployeeReport(Employee emp, String reportType) {
        EmployeeReportFormatter employeeReport = new EmployeeReportFormatter(emp, reportType);
        employeeReport.getFormattedEmployee();
    }
}
