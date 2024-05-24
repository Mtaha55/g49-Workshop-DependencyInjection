package lexicon.se.Data;


import lexicon.se.Model.Student;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDao {

    private final List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void removeStudent(int studentId) {

    }

    @Override
    public Student getStudentById(int studentId) {
        return null;
    }

    @Override
    public Student save(Student student) {
        System.out.println("Saving student: " + student.getName());
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        System.out.println("Finding student with id: " + id);
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
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
    public Student update(Student student) {
        return null;
    }
}