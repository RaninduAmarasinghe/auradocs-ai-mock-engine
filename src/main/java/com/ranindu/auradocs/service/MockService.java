package com.ranindu.auradocs.service;

import com.ranindu.auradocs.model.entity.ApiSpec;
import com.ranindu.auradocs.repository.ApiSpecRepository;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Service
public class MockService {
    private final ApiSpecRepository repository;
    private final OllamaChatModel chatModel;
    public MockService(ApiSpecRepository repository, OllamaChatModel chatModel) {
        this.repository = repository;
        this.chatModel = chatModel;
    }
    public String generateMock(String id) {
        ApiSpec spec = repository.findById(id).orElseThrow(() -> new RuntimeException("Spec not found"));

        String prompt = "Generate one JSON object with these fields: " + spec.getFields() +
                ". Context: " + spec.getMockContext() +
                ". Return ONLY valid JSON.";
        return chatModel.call(prompt);
    }
}
