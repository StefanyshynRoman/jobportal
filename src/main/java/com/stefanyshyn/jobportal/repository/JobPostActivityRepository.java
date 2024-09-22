package com.stefanyshyn.jobportal.repository;

import com.stefanyshyn.jobportal.entity.JobPostActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostActivityRepository extends JpaRepository<JobPostActivity, Integer> {
}
