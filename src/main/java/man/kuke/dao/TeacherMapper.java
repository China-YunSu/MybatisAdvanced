package man.kuke.dao;

import man.kuke.model.Student;
import man.kuke.model.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: kuke
 * @date: 2020/11/30 - 17:16
 * @description:
 */
public interface TeacherMapper {
    @Select("select * from teacher")
    List<Teacher> getTeachers();
}
