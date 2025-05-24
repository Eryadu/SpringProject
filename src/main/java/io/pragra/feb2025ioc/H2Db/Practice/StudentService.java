package io.pragra.feb2025ioc.H2Db.Practice;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
@Data
public class StudentService {
   // @Autowired
    StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void displayAllStudents() {
        List<Student> students = studentDao.getAllStudents();
        System.out.println(students);
    }
}
