package com.OnTrack.Ontrack.repository;

import com.OnTrack.Ontrack.model.Department;
import com.OnTrack.Ontrack.model.Employee;
import com.OnTrack.Ontrack.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findAllByProjectName(String projectName);
    List <Project> findByDepartment(Department department);
    List<Project> findByEmployee(Employee employee);


}
