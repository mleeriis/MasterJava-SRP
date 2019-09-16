package com.riis.report;

import com.riis.model.Employee;

public class EmployeeReportFormatter extends ReportFormatter {
    Employee employee;
    String formatType;
    ReportFormatter report = new ReportFormatter();

    public EmployeeReportFormatter(Employee employee, String formatType){
        this.employee = employee;
        this.formatType = formatType;
    }

    public void getFormattedEmployee(){
        if (formatType == "csv") {
            System.out.println(report.convertObjectToCSV(employee));
        } else if (formatType == "xml") {
            System.out.println(report.convertObjectToXML(employee));
        } else {
            System.out.println("Error converting employee");

        }
    }

}
