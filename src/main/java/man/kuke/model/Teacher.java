package man.kuke.model;

import java.util.Arrays;
import java.util.List;

/**
 * @author: kuke
 * @date: 2020/11/30 - 17:11
 * @description:
 */
public class Teacher {
    private String id;
    private String name;
    private List<Student> student;

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                Arrays.toString(student.toArray()) + '}';
    }

    public Teacher() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
