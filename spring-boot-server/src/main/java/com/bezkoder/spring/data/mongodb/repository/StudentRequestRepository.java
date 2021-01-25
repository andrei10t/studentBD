package com.bezkoder.spring.data.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.spring.data.mongodb.model.StudentRequest;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRequestRepository extends MongoRepository<StudentRequest, String> {
  List<StudentRequest> findByPublished(boolean published);
  List<StudentRequest> findByStudentNameContaining(String studentName);
}
