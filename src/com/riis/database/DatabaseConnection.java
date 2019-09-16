package com.riis.database;

public class DatabaseConnection {
    String databaseName;
    public DatabaseConnection(String databaseName){
        this.databaseName = databaseName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
}
