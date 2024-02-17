package com.course.course.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Course {

    @Id
    private long id;
    private String title;
    private String description;
//
//    public Course(long id, String title, String description) {
//        this.id = id;
//        this.title = title;
//        this.description = description;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
}
