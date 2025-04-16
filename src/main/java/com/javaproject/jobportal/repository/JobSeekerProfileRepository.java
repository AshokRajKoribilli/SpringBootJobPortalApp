package com.javaproject.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.jobportal.entity.JobSeekerProfile;

public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile, Integer> {

}
