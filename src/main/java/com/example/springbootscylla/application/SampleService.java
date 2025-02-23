package com.example.springbootscylla.application;

import com.example.springbootscylla.domain.entity.Users;
import com.example.springbootscylla.infrastructure.SampleRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    private final SampleRepository sampleRepository;


    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public List<Users> getUsers() {
        return sampleRepository.findAll();
    }
}
