package lexicon.se.Data;




import lexicon.se.Model.Student;
import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();
    void addStudent(Student student);
    void removeStudent(int studentId);
    Student getStudentById(int studentId);

    Student save(Student student);
    Student find(int id);
    List<Student> findAll();
    Student delete(int id);

    Student findById(int id);

    Student update(Student student);
}
