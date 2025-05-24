package io.pragra.feb2025ioc.H2Db;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public void displayEmployees() {
        List<Employee> employees = employeeDao.fetchAllEmployeesFromDB();
        System.out.println(employees);
    }
}
