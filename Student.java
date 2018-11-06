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
public class Student extends Person implements Changeable {

    public String classStatus;
    Scanner input = new Scanner(System.in);

    public Student() {

    }

    public String getStudentFirstName(String fName) {
        System.out.println("What is your first name?");
        fName = input.next();
        firstName = fName;
        return fName;
    }

    public String getStudentLastName(String lName) {
        System.out.println("What is your last name?");
        lName = input.next();
        lastName = lName;
        return lName;
    }

    public String studentStatus(String status) {
        System.out.println("Enter your student status.");
        status = input.next();
        classStatus = status;
        return classStatus;
    }

    public String studentEmail(String email) {
        System.out.println("Enter your email address.");
        email = input.next();
        emailAddress = email;
        return email;
    }

    public String studentPhoneNum(String phoneNum) {
        System.out.println("Enter your phone number.");
        phoneNum = input.next();
        phoneNumber = phoneNum;
        return phoneNum;
    }

    public String ToString() {
        return super.ToString() + " is " + classStatus;
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
