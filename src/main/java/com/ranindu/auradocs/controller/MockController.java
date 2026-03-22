package com.ranindu.auradocs.controller;

import com.ranindu.auradocs.model.entity.ApiSpec;
import com.ranindu.auradocs.repository.ApiSpecRepository;
import com.ranindu.auradocs.service.MockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/specs")
public class MockController {
    private final MockService mockService;
    private final ApiSpecRepository repository;

    public MockController(MockService mockService, ApiSpecRepository repository) {
        this.mockService = mockService;
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<ApiSpec> createSpec(@RequestBody ApiSpec spec) {
        return ResponseEntity.ok(repository.save(spec));
    }

    @GetMapping
    public List<ApiSpec> getAllSpecs(){
        return repository.findAll();
    }

    @GetMapping("/{id}/generate")
    public String generateMock(@PathVariable String id) {
        return mockService.generateMock(id);
        }

}

