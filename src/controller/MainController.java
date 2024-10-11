/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.Course;
import model.OfflineCourse;
import model.OnlineCourse;
import view.ConsoleView;

public class MainController {
    private List<Course> courses = new ArrayList<>();
    private ConsoleView view = new ConsoleView();

    public void run() {
        int choice;
        do {
            choice = view.displayMainMenu();
            switch (choice) {
                case 1:
                    addCourse();
                    break;
                case 2:
                    updateCourse();
                    break;
                case 3:
                    deleteCourse();
                    break;
                case 4:
                    printCourses();
                    break;
                case 5:
                    searchCourses();
                    break;
                case 6:
                    view.displayMessage("Goodbye!");
                    break;
                default:
                    view.displayMessage("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    private void addCourse() {
        String courseType = view.inputCourseType();
        if (courseType.equalsIgnoreCase("O")) {
            OnlineCourse onlineCourse = new OnlineCourse();
            onlineCourse.inputAll();
            courses.add(onlineCourse);
        } else if (courseType.equalsIgnoreCase("F")) {
            OfflineCourse offlineCourse = new OfflineCourse();
            offlineCourse.inputAll();
            courses.add(offlineCourse);
        } else {
            view.displayMessage("Invalid input. Please enter O for Online or F for Offline.");
        }
    }

    private void updateCourse() {
        String courseId = view.inputCourseId();
        Optional<Course> courseToUpdate = courses.stream()
                .filter(course -> course.getCourseId().equalsIgnoreCase(courseId))
                .findFirst();

        if (courseToUpdate.isPresent()) {
            view.displayMessage("Updating course information...");
            courseToUpdate.get().inputAll();
            view.displayMessage("Course updated successfully.");
        } else {
            view.displayMessage("Course not found.");
        }
    }

    private void deleteCourse() {
        String courseId = view.inputCourseId();
        courses.removeIf(course -> course.getCourseId().equalsIgnoreCase(courseId));
        view.displayMessage("Course deleted if it existed.");
    }

    private void printCourses() {
        for (Course course : courses) {
            course.printInfo();
        }
    }

    private void searchCourses() {
        String courseName = view.inputCourseName();
        courses.stream()
                .filter(course -> course.getCourseName().equalsIgnoreCase(courseName))
                .forEach(Course::printInfo);
    }
}

