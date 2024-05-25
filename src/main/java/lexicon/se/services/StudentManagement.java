package lexicon.se.services;

import lexicon.se.Model.Student;

import java.util.List;


public interface StudentManagement {
    Student create();
    Student save(Student student);

    default Student find(int id) {
        return null;
    }

    Student remove(int id);
    List<Student> findAll();
    void edit(Student student);
}
