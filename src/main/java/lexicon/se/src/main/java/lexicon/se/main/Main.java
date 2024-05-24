package lexicon.se.main;


import lexicon.se.Config.AppConfig;
import lexicon.se.Data.StudentDao;
import lexicon.se.Model.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lexicon.se.Config.ComponentScanConfig;
import lexicon.se.services.UserInputService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class, AppConfig.class);

        StudentDao studentDao = context.getBean(StudentDao.class);

        // Test the StudentDao methods
        Student student = new Student();
        student.setId(1);
        student.setName("John Doe");
        studentDao.save(student);

        Student foundStudent = studentDao.find(1);
        System.out.println("Found Student: " + foundStudent.getName());

        UserInputService userInputService = context.getBean(UserInputService.class);

        // Test the UserInputService methods
        String inputString = userInputService.getString();
        System.out.println("You entered the string: " + inputString);

        int inputInt = userInputService.getInt();
        System.out.println("You entered the integer: " + inputInt);

        context.close();
    }
}


