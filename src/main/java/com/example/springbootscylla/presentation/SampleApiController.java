package com.example.springbootscylla.presentation;

import com.example.springbootscylla.application.SampleService;
import com.example.springbootscylla.domain.entity.Users;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleApiController {
    private final SampleService sampleService;

    public SampleApiController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/test")
    public List<Users> getUsers() {
        return sampleService.getUsers();
    }


}
