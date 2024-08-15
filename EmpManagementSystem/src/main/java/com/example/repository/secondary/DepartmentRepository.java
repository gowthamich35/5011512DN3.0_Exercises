package com.example.repository.secondary;

import com.example.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Employee, Long> {
}
