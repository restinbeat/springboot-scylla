package com.example.springbootscylla.presentation;

import com.example.springbootscylla.application.SampleService;
import com.example.springbootscylla.domain.entity.Users;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SampleApiController {
    private final SampleService sampleService;

    @GetMapping("/test")
    public List<Users> getUsers() {
        return sampleService.getUsers();
    }


}
