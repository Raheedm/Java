/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author RAHEED
 */
import java.math.BigInteger;

public class EmployeeDetails {

    private String id;
    private String First_name;
    private String Last_name;
    private String Designation;
    private String Address;
    private BigInteger Contact_number;
    private String Department;
    //private int Job_Type;
    private double salary;

    private double basicpay;
    private double total_salary;
    private double da;
    private int daysworked;
    private double daily_allowance;

    public EmployeeDetails(double basicpay, double salary, int daysworked, double daily_allowance) {
        this.basicpay = basicpay;
        this.daysworked = daysworked;
        this.daily_allowance = daily_allowance;
        this.salary = salary;
    }

    public EmployeeDetails(String id, String First_name, String Last_name, String Designation, String Address, BigInteger Contact_number, String Department, double basicpay, int daysworked, double daily_allowance, double salary) {
        this.id = id;
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.Designation = Designation;
        this.Address = Address;
        this.Contact_number = Contact_number;
        this.Department = Department;
        this.basicpay = basicpay;
        this.daysworked = daysworked;
        this.daily_allowance = daily_allowance;
        this.salary = salary;

    }

    public EmployeeDetails(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public BigInteger getContact_number() {
        return Contact_number;
    }

    public void setContact_number(BigInteger Contact_number) {
        this.Contact_number = Contact_number;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public double getBasicpay() {
        return basicpay;
    }

    public void setBasicpay(double basicpay) {
        this.basicpay = basicpay;
    }

    public int getDaysworked() {
        return daysworked;
    }

    public void setDaysworked(int daysworked) {
        this.daysworked = daysworked;
    }

    public double getDaily_allowance() {
        return daily_allowance;
    }

    public void setDaily_allowance(double daily_allowance) {
        this.daily_allowance = daily_allowance;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double fulltimeCalc_salary() {

        da = basicpay * 0.24;
        total_salary = basicpay + da;
        return total_salary;
    }

    public double ContractClac_salary() {
        return salary;

    }

    public double DailyWagesCalc_salary() {
        total_salary = daily_allowance * daysworked;
        return (double) total_salary;
    }

}
