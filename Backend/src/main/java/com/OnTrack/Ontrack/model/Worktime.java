package com.OnTrack.Ontrack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Table(name = "worktime")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Worktime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "worktime_id")
    private Long id;

    private LocalDateTime clockIn;
    private LocalDateTime breakStart;
    private LocalDateTime breakEnd;
    private LocalDateTime clockOut;
    private double overtime;
    private double totalHours;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;
}

