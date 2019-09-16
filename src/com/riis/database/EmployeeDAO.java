package com.riis.database;

import com.riis.model.Employee;

public class EmployeeDAO {
    DatabaseConnectionManager dbConnection;

    public EmployeeDAO(DatabaseConnectionManager dbConnection){
        this.dbConnection = dbConnection;
    }

    public void saveEmployee(Employee emp){
        System.out.println("Saving " + emp.getName() + " to database " + dbConnection.getDatabaseName());
    }

    public void deleteEmployee(Employee emp){
        System.out.println("Delete " + emp.getName() + " from database " + dbConnection.getDatabaseName());
    }
}
