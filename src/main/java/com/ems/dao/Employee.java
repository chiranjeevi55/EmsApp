package com.ems.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Id private String id;
    private String employeeName;
    private String employeeEmail;
    private Long employeePhone;
    private String employeeGender;
    private String employeeSalary;
    private String employeeRole;
}