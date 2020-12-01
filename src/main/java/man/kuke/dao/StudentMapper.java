package man.kuke.dao;

import man.kuke.model.Student;
import java.util.List;

/**
 * @author: kuke
 * @date: 2020/11/30 - 16:40
 * @description:
 */
public interface StudentMapper {
    List<Student> getStudents();
    List<Student> getStudents2();
}
