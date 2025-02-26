package com.OnTrack.Ontrack.repository;

import com.OnTrack.Ontrack.model.Department;
import com.OnTrack.Ontrack.model.Employee;
import com.OnTrack.Ontrack.model.Vacation;
import com.OnTrack.Ontrack.model.VacationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface VacationRepository extends JpaRepository<Vacation, Long> {
    List<Vacation> findByEmployee(Employee employee);
    List<Vacation> findByStatus(VacationStatus status);

}
