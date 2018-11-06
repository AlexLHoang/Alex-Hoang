/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Staff extends Employee implements Changeable {

    String title;
    Scanner input = new Scanner(System.in);

    Staff() {

    }

    public String getEmployeeFirstName(String fName) {
        System.out.println("What is your first name?");
        fName = input.next();
        firstName = fName;
        return fName;
    }

    public String getEmployeeLasatName(String lName) {
        System.out.println("What is your first name?");
        lName = input.next();
        firstName = lName;
        return lName;
    }

    public String employeeEmail(String email) {
        System.out.println("Enter your email.");
        email = input.next();
        emailAddress = email;
        return email;
    }

    public String employeePhoneNum(String phoneNum) {
        System.out.println("Enter your phone number");
        phoneNum = input.next();
        phoneNumber = phoneNum;
        return phoneNum;
    }

    public String OfficeName(String fInfo) {
        System.out.println("Enter your office");
        fInfo = input.next();
        office = fInfo;
        return fInfo;
    }

    public String employement(String date) {
        System.out.println("Enter your employmentDate name");
        date = input.next();
        employmentDate = date;
        return date;
    }

    public String OfficeNum(String officeNum) {
        System.out.println("Enter your phone Number");
        officeNum = input.next();
        officeNumber = officeNum;
        return officeNum;
    }

    public String getTitle() {
        System.out.println("Enter your staff title.");
        String sTitle = input.next();

        return sTitle;
    }
    
    public String ToString() {
        return super.ToString() + " is " + title;
    }
 

    @Override
    public void changeable(String first, String last) {
        if (first != "") {
            super.firstName = first;
        }
        if (last != "") {
            super.lastName = last;
        }
    }
}
