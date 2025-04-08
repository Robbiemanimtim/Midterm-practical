package com.rocs.store.desktop.app.facade.items.impl;

import com.rocs.store.desktop.app.facade.items.Itemfacade;
import com.rocs.store.desktop.data.connector.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

import static com.rocs.store.desktop.data.connector.Connection.*;

public class ItemFacadeImpl {
    public void getAllItems() {
        String query = "SELECT * FROM Item";

        try (
                Connection conn = Connection.getConnection(URL, USERNAME, PASSWORD);
                Statement stmt = ((java.sql.Connection) conn).createStatement();
                ResultSet rs = stmt.executeQuery(query);
        ) {
            while (rs.next()) {
                int cust_id = rs.getInt("cust_id");
                String cust_name = rs.getString("cust_name");
                String Address = rs.getString("Address");


                System.out.println("Customer_ID: " + cust_id + ", Name: " + cust_name +
                        ", Address: " + Address);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Itemfacade facade = new Itemfacade() {
            facade.getAllItems();


        }
    }
}
