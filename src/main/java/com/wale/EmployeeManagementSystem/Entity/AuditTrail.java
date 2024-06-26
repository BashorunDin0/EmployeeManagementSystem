package com.wale.EmployeeManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuditTrail {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String action;
    private String employeeNumber;
    private Timestamp timestamp;
    private String employeeName;


}
