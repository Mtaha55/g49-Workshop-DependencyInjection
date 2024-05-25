package lexicon.se.services;

import lexicon.se.Data.StudentDao;
import lexicon.se.Model.Student;

import java.util.List;

public class StudentManagementConsoleImpl implements StudentManagement {
    private final UserInputService userInputService;
    private final StudentDao studentDao;

    public StudentManagementConsoleImpl(UserInputService userInputService, StudentDao studentDao) {
        this.userInputService = userInputService;
        this.studentDao = studentDao;
    }

    @Override
    public Student create() {
        System.out.println("Enter student name: ");
        String name = userInputService.getInput();
        System.out.println("Enter student age: ");
        userInputService.getInput();
        Student student = new Student();
        return save(student);
    }

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student find(int id) {
        return studentDao.findById(id);
    }

    @Override
    public Student remove(int id) {
        return studentDao.delete(id);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public void edit(Student student) {
        studentDao.update(student);
    }
}
