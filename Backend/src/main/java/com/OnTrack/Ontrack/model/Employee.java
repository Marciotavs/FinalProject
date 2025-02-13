package com.OnTrack.Ontrack.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "employee")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;


    //join the employee table with project table
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    //join the table employee with department table
    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
     private List<Worktime> workTimes;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vacation> vacations ;

    @OneToOne(mappedBy = "employee")
    private Salary salary;



}
