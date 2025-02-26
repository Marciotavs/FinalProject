package com.OnTrack.Ontrack.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "department")
    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor

    public class Department {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "dept_id")
        private Long id;
        private String departName;

       @OneToMany(mappedBy = "department" , cascade = CascadeType.ALL, orphanRemoval = true)
        private List<Project> project;



}
