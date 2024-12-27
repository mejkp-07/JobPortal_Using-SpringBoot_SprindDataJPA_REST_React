package com.telusko.spring_boot_rest.repo;

import com.telusko.spring_boot_rest.model.JobPost;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {
    public List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile,
                                                                         String postDesc);
}
