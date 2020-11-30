package man.kuke.dao;

import man.kuke.model.Student;
import man.kuke.model.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: kuke
 * @date: 2020/11/30 - 16:40
 * @description:
 */
public interface StudentMapper {
    @Select("select * from student")
    List<Student> getStudents();
}
