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
        return new ArrayList<>(students);
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getId() == studentId);
    }

    @Override
    public Student getStudentById(int studentId) {
        return students.stream()
                .filter(student -> student.getId() == studentId)
                .findFirst()
                .orElse(null);
    }
}
