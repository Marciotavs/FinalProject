package com.OnTrack.Ontrack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Table(name = "project")
    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor

    public class Project {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "project_id")
        private Long id;
        private String projectName;
        private LocalDate startDate;
        private LocalDate endDate;
        private String description;

        @ManyToOne
        @JoinColumn(name = "dept_id" , nullable = false)
        private Department department;

    @OneToMany(mappedBy = "project" , cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employee;



}
