package com.bezkoder.spring.data.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tutorials")
public class StudentRequest {
  @Id
  private String id;

  private String studentName;
  private String description;
  private boolean status;

  public StudentRequest() {

  }

  public StudentRequest(String studentName, String description, boolean published) {
    this.studentName= studentName;
    this.description = description;
    this.status = published;
  }

  public String getId() {
    return id;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isPublished() {
    return status;
  }

  public void setPublished(boolean isPublished) {
    this.status = isPublished;
  }

  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", studentName=" + studentName + ", desc=" + description + ", published=" + status + "]";
  }
}
