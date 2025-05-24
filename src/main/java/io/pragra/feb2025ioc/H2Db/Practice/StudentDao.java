package io.pragra.feb2025ioc.H2Db.Practice;

import org.springframework.stereotype.Repository;

import java.util.List;

// DataAccess Interface
//@Repository
public interface StudentDao {
    List<Student> getAllStudents();
}
