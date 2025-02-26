package com.OnTrack.Ontrack.repository;

import com.OnTrack.Ontrack.model.Employee;
import com.OnTrack.Ontrack.model.VacationStatus;
import com.OnTrack.Ontrack.model.Worktime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkTimeRepository extends JpaRepository<Worktime , Long> {

    List<Worktime> findByEmployee(Employee employee);


}
