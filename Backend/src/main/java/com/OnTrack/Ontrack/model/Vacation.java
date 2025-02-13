package com.OnTrack.Ontrack.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table (name = "Vacation")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Vacation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_id")
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private VacationStatus status;

    @ManyToOne
    @JoinColumn(name = "employee_id",  nullable = false)
    private Employee employee;

}

