package com.wale.EmployeeManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Grade {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String gradeName;
    private String description;
    private int level;
    private boolean isActive;
    private Double salary;

}
