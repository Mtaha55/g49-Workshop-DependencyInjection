package lexicon.se.main;


import lexicon.se.Config.AppConfig;
import lexicon.se.Data.StudentDao;
import lexicon.se.Model.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);

        // Add some students
        studentDao.addStudent(new Student(1, "John Doe"));
        studentDao.addStudent(new Student(2, "Jane Smith"));

        // List all students
        studentDao.getAllStudents().forEach(System.out::println);

        context.close();
    }
}


