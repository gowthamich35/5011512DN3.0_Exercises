package com.example.projection;

import org.springframework.beans.factory.annotation.Value;

public interface CustomPro {

    String getName();

    @Value("#{target.email + ' (' + target.department.name + ')'}")
    String getEmailWithDepartment();
}