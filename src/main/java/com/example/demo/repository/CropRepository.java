package com.example.demo.repository;

import com.example.demo.model.CropDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  CropRepository extends MongoRepository<CropDetails,Long> {
}
