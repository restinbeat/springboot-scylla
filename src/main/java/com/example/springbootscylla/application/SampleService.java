package com.example.springbootscylla.application;

import com.example.springbootscylla.domain.entity.Users;
import com.example.springbootscylla.infrastructure.SampleRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class SampleService {

    private final SampleRepository sampleRepository;


    public List<Users> getUsers() {
        return sampleRepository.findAll();
    }
}
