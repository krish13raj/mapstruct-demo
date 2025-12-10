package com.example.mapstruct_demo.repository;

import com.example.mapstruct_demo.common.model.entity.ApplicantEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApplicantRepository extends MongoRepository<ApplicantEntity, String> {
    ApplicantEntity findByApplicantId(String applicantId);
}

