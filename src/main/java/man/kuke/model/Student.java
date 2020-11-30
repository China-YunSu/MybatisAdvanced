package man.kuke.model;

/**
 * @author: kuke
 * @date: 2020/11/30 - 17:11
 * @description:
 */
public class Student {
    private String id;
    private String name;
    private Teacher teacher;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }

    public Student() {
    }

    public Student(String id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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
