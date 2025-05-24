package io.pragra.feb2025ioc.H2Db.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//@Component
public class StudentDaoImpl implements StudentDao {

    //Use JDBC Template's query() method to fetch data from db
   // @Autowired
    public JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student>  studentList = jdbcTemplate.query("SELECT * FROM student",new RowMapper<Student>() {

            //@Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt("ID"));
                student.setName(rs.getString("NAME"));
                student.setDepartment(rs.getString("DEPARTMENT"));
                return student;
            }
        });
        return studentList;
    }
}
