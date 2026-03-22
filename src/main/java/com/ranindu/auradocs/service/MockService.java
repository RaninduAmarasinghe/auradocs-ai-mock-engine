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

        String prompt = String.format(
                "Generate one realistic JSON object. Fields: %s. Context: %s. " +
                        "Output MUST be raw JSON only. Do not include any intro, explanation, or markdown blocks.",
                spec.getFields().toString(),
                spec.getMockContext()
        );
        return chatModel.call(prompt);
    }
}
