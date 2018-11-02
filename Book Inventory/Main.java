//BookInventory.java
//IS 147 Final Project
//Oct 29, 2018


package com.company;

import java.util.Scanner;
//import java.util.*;

public class Main {
    public static int printMenu() {

        Scanner input = new Scanner(System.in);
        int choice = 0;

        System.out.println("------------------------------");
        System.out.println("Enter 1 to display the inventory");
        System.out.println("Enter 2 to display the books by one author");
        System.out.println("Enter 3 to add a book");
        System.out.println("Enter 4 to remove a book");
        System.out.println("Enter 5 to view the total number of books in the inventory");
        System.out.println("Enter 6 to see the total amount of the entire inventory");
        System.out.println("Enter 7 to exit");
        try {
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            return choice;

        }
        catch(Exception e){
            System.out.println("Invalid choice!");
        }

        return choice;

}



    public static void main(String[] args) {

        Boolean flag = true;

        while (flag) {

            int choice = printMenu();
            switch (choice) {
                case 1:
                    System.out.println("Class for displaying inventory");
                    break;
                case 2:
                    System.out.println("Class for displaying books by an author");
                    break;
                case 3:
                    System.out.println("Class for adding a book");
                    break;
                case 4:
                    System.out.println("Class removing a book");
                    break;
                case 5:
                    System.out.println("Class viewing total number of books in inventory");
                    break;
                case 6:
                    System.out.println("Class total amount of entire research");
                    break;
                case 7:
                    System.out.println("Have a nice day!");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Number");
                    break;
            }
        }
    }
}
