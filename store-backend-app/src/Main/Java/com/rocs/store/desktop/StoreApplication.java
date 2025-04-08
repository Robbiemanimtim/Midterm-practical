package com.rocs.store.desktop;

import java.util.Scanner;

public class StoreApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Store Application");
        System.out.println("Please choose:");
        System.out.println("1 - Retrieve item status");
        System.out.println("2 - Retrieve customer detail");
        System.out.println("3 - Retrieve Student Medical Record");

        System.out.println("enter your choice");
        int choice = scanner.nextInt();
    }
}
