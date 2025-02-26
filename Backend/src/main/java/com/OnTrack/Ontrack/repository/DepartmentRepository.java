package com.OnTrack.Ontrack.repository;

import com.OnTrack.Ontrack.model.Department;

import com.OnTrack.Ontrack.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface  DepartmentRepository extends JpaRepository<Department, Long> {

    List<Department> findByDepartName(String departName);
    List<Department> findByProject(Project project);
   // List<Department> findByEmployee(Employee employee);

}
