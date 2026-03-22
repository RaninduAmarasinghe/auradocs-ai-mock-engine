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

    private String name;           // Matches "name" in Postman
    private String endpointPath;   // Matches "endpointPath" in Postman
    private String method;         // Add this to capture "method" if you send it

    private Map<String, String> fields;
    private String mockContext;
}
