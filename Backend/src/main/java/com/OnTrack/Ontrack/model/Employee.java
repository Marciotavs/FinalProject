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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "employeeID", nullable = false, unique = true)
    private String employeeID;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "phone")
    private String phone;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

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
