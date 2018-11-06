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
public class Faculty extends Employee implements Changeable {

    String rank;
    Scanner input = new Scanner(System.in);

    public Faculty() {

    }
    //Gets faculty rank
    public String getRank() {
        System.out.println("Enter your faculty rank.");
        rank = input.next();
        return rank;
    }
    
    public String facultyFirst(String fName) {
        System.out.println("What is your first name?");
        fName = input.next();
        firstName = fName;
        return fName;
    }

    public String facultyLast(String lName) {
        System.out.println("What is your last name?");
        lName = input.next();
        lastName = lName;
        return lName;
    }

    public String facultyEmail(String email) {
        System.out.println("Enter your email address.");
        email = input.next();
        emailAddress = email;
        return email;
    }

    public String facultyPhoneNum(String phoneNum) {
        System.out.println("Enter your phone number.");
        phoneNum = input.next();
        phoneNumber = phoneNum;
        return phoneNum;
    }

    public String OfficeNum(String officeNum) {
        System.out.println("Enter your office phone Number");
        officeNum = input.next();
        officeNumber = officeNum;
        return officeNum;
    }
    
    public String OfficeName()
    {
        System.out.println("Enter your office number.");
        office = input.next();
        return office;
    }

    public String ToString() {
        return super.ToString() + " is " + rank;
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
