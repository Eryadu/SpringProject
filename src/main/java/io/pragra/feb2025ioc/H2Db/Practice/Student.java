package io.pragra.feb2025ioc.H2Db.Practice;


import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.dialect.IdGeneration;
import org.springframework.stereotype.Service;

// POJO Class Entity
@Data
public class Student {
    private int id;
    private String name;
    private String department;
}
