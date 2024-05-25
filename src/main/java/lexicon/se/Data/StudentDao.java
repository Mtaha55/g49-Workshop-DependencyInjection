package lexicon.se.Data;




import lexicon.se.Model.Student;
import java.util.List;

public interface StudentDao {

    default void addStudent(Student student) {

    }

    Student save(Student student);

    List<Student> findAll();
    Student delete(int id);

    Student findById(int id);

    void update(Student student);
}
