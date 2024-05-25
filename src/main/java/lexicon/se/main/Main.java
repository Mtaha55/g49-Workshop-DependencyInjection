package lexicon.se.main;


import lexicon.se.Model.Student;

import lexicon.se.Data.StudentDaoImpl;
import lexicon.se.services.StudentManagement;
import lexicon.se.services.StudentManagementConsoleImpl;
import lexicon.se.services.UserInputServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserInputServiceImpl userInputService = new UserInputServiceImpl();
        StudentDaoImpl studentDao = new StudentDaoImpl();
        StudentManagement studentManagement = new StudentManagementConsoleImpl(userInputService, studentDao);

        // Example usage
        System.out.println("Create a new student:");
        Student newStudent = studentManagement.create();
        System.out.println("Created Student: " + newStudent);

        System.out.println("Find student with ID 1:");
        Student foundStudent = studentManagement.find(1);
        System.out.println("Found Student: " + foundStudent);

        System.out.println("List all students:");
        studentManagement.findAll().forEach(System.out::println);

        System.out.println("Edit student with ID 1:");
        newStudent.setName("Updated Name");
        newStudent.setAge(22);
        studentManagement.edit(newStudent);
        System.out.println("Updated Student: " + studentManagement.find(1));

        System.out.println("Remove student with ID 1:");
        Student removedStudent = studentManagement.remove(1);
        System.out.println("Removed Student: " + removedStudent);

        System.out.println("List all students after removal:");
        studentManagement.findAll().forEach(System.out::println);
    }
}