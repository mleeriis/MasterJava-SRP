package com.riis.database;

public class DatabaseConnectionManager extends DatabaseConnection {
    public DatabaseConnectionManager(String databaseName) {
        super(databaseName);
    }

    public void connect(){
        System.out.println("Connecting to database " + this.databaseName);
    }

    public void disconnect(){
        System.out.println("Disconnecting from database " + this.databaseName);
    }
}
