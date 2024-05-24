package lexicon.se.Model;



public class Student {
    private int id;
    private String name;

    public Student(String name, int age) {
        this.id = id;
        this.name = this.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + '\'' + '}';
    }
}

