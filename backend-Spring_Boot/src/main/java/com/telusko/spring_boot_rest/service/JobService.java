package com.telusko.spring_boot_rest.service;

import com.telusko.spring_boot_rest.model.JobPost;
import com.telusko.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    JobRepo jobRepo;

    public List<JobPost> getAllJobs() {
        return jobRepo.findAll();
    }

    public void addJob(JobPost job) {
        jobRepo.save(job);
    }
    public JobPost getJob(int postId){
        Optional<JobPost> j = jobRepo.findById(postId);
        return j.orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        jobRepo.save(jobPost);
    }

    public void deleteJob(int postId) {
        jobRepo.deleteById(postId);
    }

    public void load() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "Java Developer", "Responsible for backend development", 3, Arrays.asList("Java", "Spring", "Hibernate")),
                new JobPost(2, "Frontend Developer", "Create interactive UI components", 2, Arrays.asList("React", "CSS", "JavaScript")),
                new JobPost(3, "Data Scientist", "Analyze data and build models", 5, Arrays.asList("Python", "Pandas", "TensorFlow")),
                new JobPost(4, "DevOps Engineer", "Setup CI/CD pipelines", 4, Arrays.asList("Docker", "Kubernetes", "AWS")),
                new JobPost(5, "Android Developer", "Develop mobile apps", 3, Arrays.asList("Kotlin", "Jetpack Compose", "Firebase")),
                new JobPost(6, "Full Stack Developer", "Work on both frontend and backend", 4, Arrays.asList("Node.js", "Angular", "MongoDB"))
        ));
        jobRepo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
        return jobRepo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
    }
}
