package com.OnTrack.Ontrack.repository;

import com.OnTrack.Ontrack.model.Department;
import com.OnTrack.Ontrack.model.Employee;
import com.OnTrack.Ontrack.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByEmployeeID(String employeeID);
    List<Employee> findByFirstName(String firstName);
    List<Employee> findByDepartment(Department department);
    List<Employee> findByProject(Project project);

}
