/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    public int displayMainMenu() {
        System.out.println("*** Course Management ***");
        System.out.println("1. Add online course/ offline course");
        System.out.println("2. Update course");
        System.out.println("3. Delete course");
        System.out.println("4. Print all / online course / offline course");
        System.out.println("5. Search information based on course name");
        System.out.println("6. Exit");
        System.out.print("Your choice: ");
        return scanner.nextInt();
    }

    public String inputCourseType() {
        scanner.nextLine();  // Consume newline
        System.out.print("Online (O) or Offline (F): ");
        return scanner.nextLine();
    }

    public String inputCourseId() {
        System.out.print("Enter course ID: ");
        return scanner.nextLine();
    }

    public String inputCourseName() {
        System.out.print("Enter course name: ");
        return scanner.nextLine();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

