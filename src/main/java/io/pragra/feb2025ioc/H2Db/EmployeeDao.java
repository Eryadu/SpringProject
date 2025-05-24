package io.pragra.feb2025ioc.H2Db;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class EmployeeDao {

    @Autowired
            // jdbc template's query() will be used to fetch data from DB
    JdbcTemplate jdbcTemplate;

    public List<Employee> fetchAllEmployeesFromDB() {

       /* // Custom Row Mapper to fetch data from DB
        RowMapper<Employee> rowMapper = new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee employee = new Employee();
                employee.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
                employee.setEmployeeName(rs.getString("EMPLOYEE_NAME"));
                employee.setEmployeeEmail(rs.getString("EMPLOYEE_EMAIL"));
                employee.setEmployeePhoneNo(rs.getInt("EMPLOYEE_PHONE_NO"));
                return employee;
            }
        };

        // query() fetch employee and depend on how many records found in DB , everytime it call rowMapper to fetch data
        // and collect in list
        // query() accept two parameters SQL Query(QueryConstant), RowMapper
        List<Employee> employeeList = jdbcTemplate.query(QueryConstants.FETCH_EMPLOYEE, rowMapper);
        return employeeList;*/

        //Using Spring inbuilt RowMapper
        List<Employee> employeesList2 = jdbcTemplate.query(QueryConstants.FETCH_EMPLOYEE, new BeanPropertyRowMapper<>(Employee.class));
        return employeesList2;
    }
} 
