/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author RAHEED
 */
import java.util.Scanner;
import java.math.BigInteger;

public class Employee {

    public static void main(String[] args) {
        String id, First_name, Last_name, Designation, Address, Department;
        int i, n;
        int Job_Type = 1;
        double basicpay = 0;
        int daysworked = 0;
        double daily_allowance = 0;
        double salary = 0;

        BigInteger Contact_number;

        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter the Number of employees");
        //n = scan.nextInt();
        n = 1;
        EmployeeDetails em[] = new EmployeeDetails[n];
        int choice;
        //for (i = 0; i < n; i++) 
        do {
            System.out.println("Enter Employee ID");
            id = scan.next();

            System.out.println("Enter Employee First Name ");
            First_name = scan.next();

            System.out.println("Enter Employee Last Name");
            Last_name = scan.next();

            System.out.println("Enter Employee Designation");
            Designation = scan.next();

            System.out.println("Enter Employee Address");
            Address = scan.next();

            System.out.println("Enter Employee Department");
            Department = scan.next();

            System.out.println("Enter Employee Contact Number");
            Contact_number = scan.nextBigInteger();

            System.out.println("Enter Employees Job Type \n 1.Full Time\n 2.Contract Based \n 3.Daily Waged \n Press 1 For Full Time \n Press 2 For Contract Based \n Press 3 For Daily Waged");

            Job_Type = scan.nextInt();
            if (Job_Type == 1) {
                System.out.println("Enter Employee Basic Pay");
                basicpay = scan.nextDouble();

            }

            if (Job_Type == 3) {
                System.out.println("Enter Days Worked");
                daysworked = scan.nextInt();
                System.out.println("Enter Daily Allowance");
                daily_allowance = scan.nextInt();
            }

            if (Job_Type == 2) {
                System.out.println("Enter Employee Salary");
                salary = scan.nextDouble();
            }
            if (Job_Type > 3) {
                System.out.println("Enter Valid Number");
            }
            for (i = 0; i < n; i++) {
                em[i] = new EmployeeDetails(id, First_name, Last_name, Designation, Address, Contact_number, Department, basicpay, daysworked, daily_allowance, salary);
            }

            for (i = 0; i < n; i++) {

                if (Job_Type == 1) {

                    System.out.println(" Full Time   \n Salary of " + em[i].getFirst_name() + " is = " + em[i].fulltimeCalc_salary());

                } else if (Job_Type == 2) {

                    System.out.println(" Contract Based   \n Salary of " + em[i].getFirst_name() + " is =" + em[i].ContractClac_salary());

                } else {

                    System.out.println(" Daily Waged   \n Salary of " + em[i].getFirst_name() + " is = " + em[i].DailyWagesCalc_salary());

                }

                System.out.print("_________________________");

                System.out.println("\nEmployee ID: " + em[i].getId());
                System.out.println("Employee Name: " + em[i].getFirst_name() + " " + em[i].getLast_name());
                System.out.println("Employee Designation: " + em[i].getDesignation());
                System.out.println("Employee Address: " + em[i].getAddress());
                System.out.println("Employee Department: " + em[i].getDepartment());
                System.out.println("Employee Contact Number: " + em[i].getContact_number());

            }
            System.out.println("\n");
            System.out.println("Do you want to add more employees \n Press 1 To Continue \n Press Any Other key  To end");
            choice = scan.nextInt();
        } while (choice == 1);

    }
}
