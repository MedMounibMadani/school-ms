package com.schoolapp.schoolsms.repositories;

import com.schoolapp.schoolsms.models.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
