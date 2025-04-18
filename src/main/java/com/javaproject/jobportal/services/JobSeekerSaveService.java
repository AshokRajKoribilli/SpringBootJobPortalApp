package com.javaproject.jobportal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaproject.jobportal.entity.JobPostActivity;
import com.javaproject.jobportal.entity.JobSeekerProfile;
import com.javaproject.jobportal.entity.JobSeekerSave;
import com.javaproject.jobportal.repository.JobSeekerSaveRepository;

@Service
public class JobSeekerSaveService {

    private final JobSeekerSaveRepository jobSeekerSaveRepository;

    public JobSeekerSaveService(JobSeekerSaveRepository jobSeekerSaveRepository) {
        this.jobSeekerSaveRepository = jobSeekerSaveRepository;
    }

    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId) {
        return jobSeekerSaveRepository.findByUserId(userAccountId);
    }

    public List<JobSeekerSave> getJobCandidates(JobPostActivity job) {
        return jobSeekerSaveRepository.findByJob(job);
    }
}
