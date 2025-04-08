package com.rocs.store.desktop.data.connector;

import java.sql.DriverManager;

public class Connection {

    public static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";


    public static final String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";


    public static final String USERNAME = "saristore";


    public static final String PASSWORD = "Changeme0";


    public static java.sql.Connection getConnection() {
        try {
            Class.forName(ORACLE_DRIVER).newInstance();
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception ex) {
            throw new RuntimeException("Error connecting to the database.", ex);
        }
    }
}


