package com.ranindu.auradocs.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Data
@Document(collection = "spec")
@AllArgsConstructor
@NoArgsConstructor
public class ApiSpec {
    @Id
    private String id;
    private String path;
    private String method;
    private Map<String, String> fields;
    private String mockContext;
}
