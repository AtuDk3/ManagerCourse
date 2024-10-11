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

public class OnlineCourse extends Course {
    private String platform;
    private String instructors;
    private String note;

    public OnlineCourse() {
        super();
        this.platform = "";
        this.instructors = "";
        this.note = "";
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

        System.out.print("Platform: ");
        this.platform = scanner.nextLine();

        System.out.print("Instructors: ");
        this.instructors = scanner.nextLine();

        System.out.print("Note: ");
        this.note = scanner.nextLine();
    }

    @Override
    public void printInfo() {
        System.out.printf("Course ID: %s - Name: %s - Credits: %d - Platform: %s - Instructors: %s - Note: %s\n", 
                courseId, courseName, credits, platform, instructors, note);
    }
}

