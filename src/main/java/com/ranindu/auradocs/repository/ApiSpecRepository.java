package com.ranindu.auradocs.repository;

import com.ranindu.auradocs.model.entity.ApiSpec;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiSpecRepository extends MongoRepository<ApiSpec, String> {
}
