package com.riis.report;


public class ReportFormatter {
    String formattedValue;

    public String convertObjectToXML(Object object){
        formattedValue = "XML";
        return (object + " converted to XML");
    }

    public String convertObjectToCSV(Object object){
        formattedValue = "CSV";
        return (object + " converted to CSV");
    }

    public String getFormattedValue() {
        return formattedValue;
    }
}
