package com.OnTrack.Ontrack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "salary")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Salary {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salary_id")
    private Long Id;
    private double totalHours;
    private double overTimeTotalHours;
    private double totalAmount;

   @OneToOne()
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
