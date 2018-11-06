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
public class Employee extends Person {

    String office, employmentDate, title, officeNumber;
    Scanner input = new Scanner(System.in);

    public Employee() {

    }

    public String ToString() {
        return firstName + " " + lastName;
    }

}
