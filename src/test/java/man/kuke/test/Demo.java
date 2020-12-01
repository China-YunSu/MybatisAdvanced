package man.kuke.test;

import man.kuke.dao.StudentMapper;
import man.kuke.dao.TeacherMapper;
import man.kuke.model.Student;
import man.kuke.model.Teacher;
import man.kuke.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author: kuke
 * @date: 2020/11/30 - 17:21
 * @description:
 */
public class Demo {

    @Test
    public void testStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void matchStudentandTeacher() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents();

        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void matchStudentandTeacher2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents2();
        System.out.println(students.size());
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void matchTeacherandStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.getTeachers("100");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testTeacher() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.getTeachers("100");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
