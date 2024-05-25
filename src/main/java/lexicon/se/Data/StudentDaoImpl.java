package lexicon.se.Data;


import lexicon.se.Model.Student;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDaoImpl implements StudentDao {

    private final List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {

        StudentDao.super.addStudent(student);
    }

    @Override
    public Student save(Student student) {
        System.out.println("Saving student: " + student.getName());
        students.add(student);
        return student;
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public Student delete(int id) {
        System.out.println("Deleting student with id: " + id);
        students.removeIf(student -> student.getId() == id);
        return null;
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public void update(Student student) {
    }
}