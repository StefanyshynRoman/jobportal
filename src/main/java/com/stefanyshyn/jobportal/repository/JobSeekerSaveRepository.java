package com.stefanyshyn.jobportal.repository;

import com.stefanyshyn.jobportal.entity.JobPostActivity;
import com.stefanyshyn.jobportal.entity.JobSeekerProfile;
import com.stefanyshyn.jobportal.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {
    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccount);

    List<JobSeekerSave> findByJob(JobPostActivity job);
}
