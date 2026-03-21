package com.ranindu.auradocs.service;

import com.ranindu.auradocs.model.entity.ApiSpec;
import com.ranindu.auradocs.repository.ApiSpecRepository;
import org.springframework.stereotype.Service;

@Service
public class MockService {
    private final ApiSpecRepository repository;

    public MockService(ApiSpecRepository repository) {
        this.repository = repository;
    }
    public ApiSpec createSpec(ApiSpec spec) {
        return repository.save(spec);
    }
}
