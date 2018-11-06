/*
Developer: Alex Hoang
Date: 9/8/2018
Project: SimUniversity
 */
package project1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables

        Faculty faculty = new Faculty();
        Staff staff = new Staff();
        Student student = new Student();

        ArrayList<Student> studentInfo = new ArrayList<Student>();
        ArrayList<Staff> staffInfo = new ArrayList<Staff>();
        ArrayList<Faculty> facultyInfo = new ArrayList<Faculty>();

        Scanner input = new Scanner(System.in);
        int option = -1;
        
        String stuFirstName = " ", stuLastName = " ", stuEmail = " ", stuNum = " ", stuStatus = " ",
                newName = "", changedName = "", empFirstName = " ", empLastName = " ", empEmail = " ", empNum = " ", empTitle = " ",
                fctFirstName = " ", fctLastName = " ", fctEmail = " ", fctNum = " ", fctRank = " ", empOfficeNum = "", empOffice = "",
                fctOfficeNum = "", fctOffice = "";

        
        //Loops for info
        while (option != 0) {
            System.out.println("Enter 1 to enter student info");
            System.out.println("Enter 2 to enter faculty into");
            System.out.println("Enter 3 to enter staff info");
            System.out.println("Enter 4 to change first name and last name.");
            System.out.println("Enter 5 to display the information.");
            System.out.println("Enter 0 to exit.");
            option = input.nextInt();

            switch (option) {
                case 1:
                    student.getStudentFirstName(stuFirstName);
                    student.getStudentLastName(stuLastName);
                    student.studentEmail(stuEmail);
                    student.studentPhoneNum(stuNum);
                    student.studentStatus(stuStatus);
                    studentInfo.add(student);
                    break;
                case 2:
                    staff.getEmployeeFirstName(empFirstName);
                    staff.getEmployeeLasatName(empLastName);
                    staff.employeeEmail(empEmail);
                    staff.employeePhoneNum(empNum);
                    staff.OfficeName(empOffice);
                    staff.OfficeNum(empOfficeNum);
                    staff.getTitle();
                    staffInfo.add(staff);
                    break;
                case 3:
                    faculty.facultyFirst(fctFirstName);
                    faculty.facultyLast(fctLastName);
                    faculty.facultyEmail(fctEmail);
                    faculty.facultyPhoneNum(fctNum);
                    faculty.OfficeName();
                    faculty.OfficeNum(fctOfficeNum);
                    faculty.getRank();
                    facultyInfo.add(faculty);
                    break;
                case 4:
                    System.out.println("Enter in a new name");
                    newName = input.next();
                    System.out.println("Enter in an old name");
                    changedName = input.next();

                    for (int i = 0; i <= studentInfo.size() - 1; i++) {
                        if (studentInfo.get(i).firstName == changedName) {
                            studentInfo.get(i).changeable(newName, "");
                        }
                        if (studentInfo.get(i).lastName == changedName) {
                            studentInfo.get(i).changeable("", newName);
                        }
                    }

                    for (int i = 0; i <= facultyInfo.size() - 1; i++) {
                        if (facultyInfo.get(i).firstName == changedName) {
                            facultyInfo.get(i).changeable(newName, "");
                        }
                        if (facultyInfo.get(i).lastName == changedName) {
                            facultyInfo.get(i).changeable("", newName);
                        }
                    }
                    for (int i = 0; i <= staffInfo.size() - 1; i++) {
                        if (staffInfo.get(i).firstName == changedName) {
                            staffInfo.get(i).changeable(newName, "");
                        }
                        if (staffInfo.get(i).lastName == changedName) {
                            staffInfo.get(i).changeable("", newName);
                        }
                    }

                    break;
                case 5: // displays all array lists
                    for (int i = 0; i <= studentInfo.size() - 1; i++) {
                        System.out.println(studentInfo.get(i).ToString());
                    }
                    for (int i = 0; i <= facultyInfo.size() - 1; i++) {
                        System.out.println(facultyInfo.get(i).ToString());
                    }
                    for (int i = 0; i <= staffInfo.size() - 1; i++) {
                        System.out.println(staffInfo.get(i).ToString());
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Not a valid option");
                    break;
            }
        }

        System.out.println("Thank You");
    }

}
