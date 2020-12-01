package man.kuke.dao;

import man.kuke.model.Teacher;

import java.util.List;

/**
 * @author: kuke
 * @date: 2020/11/30 - 17:16
 * @description:
 */
public interface TeacherMapper {
    List<Teacher> getTeachers(String id);
}
