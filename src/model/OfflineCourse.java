/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class OfflineCourse extends Course {
    private String beginDate;
    private String endDate;
    private String campus;
    private String teacherName;

    public OfflineCourse() {
        super();
        this.beginDate = "";
        this.endDate = "";
        this.campus = "";
        this.teacherName = "";
    }

    @Override
    public void inputAll() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Course ID: ");
        this.courseId = scanner.nextLine();

        System.out.print("Course name: ");
        this.courseName = scanner.nextLine();

        System.out.print("Credits: ");
        this.credits = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Begin date (dd/MM/yyyy): ");
        this.beginDate = scanner.nextLine();

        System.out.print("End date (dd/MM/yyyy): ");
        this.endDate = scanner.nextLine();

        System.out.print("Campus: ");
        this.campus = scanner.nextLine();

        System.out.print("Teacher's name: ");
        this.teacherName = scanner.nextLine();
    }

    @Override
    public void printInfo() {
        System.out.printf("Course ID: %s - Name: %s - Credits: %d - Begin: %s - End: %s - Campus: %s - Teacher: %s\n",
                courseId, courseName, credits, beginDate, endDate, campus, teacherName);
    }
}

