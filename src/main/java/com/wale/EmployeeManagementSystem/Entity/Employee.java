package com.wale.EmployeeManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String LastName;
    private String employeeNumber;

    @Column (unique = true)
    private String email;
    private String profilePicture;
    private String address;
    private String gender;
    private int age;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String approvalStatus;
    private boolean isActive;
    private Long gradeId;
    private Long roleId;
    private Long deptId;
}
