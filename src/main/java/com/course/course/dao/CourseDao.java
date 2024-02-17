package com.course.course.dao;

import com.course.course.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CourseDao extends JpaRepository<Course, Long> {

}
