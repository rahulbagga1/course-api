package com.course.course.services;

import com.course.course.dao.CourseDao;
import com.course.course.entities.Course;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

//    List<Course> list;

    @Autowired
    private CourseDao courseDao;

//    public CourseServiceImpl() {
//        list = new ArrayList<>();
//        list.add(new Course(123, "Java", "java language"));
//        list.add(new Course(124, "Python", "python language"));
//    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
//        return list;
    }

    @Override
    public Course getCourse(long courseId) {
//        Course c = null;
//        for(Course s: list) {
//           if (s.getId() == courseId) {
//               c = s;
//               break;
//           }
//        }
//        return c;

        return courseDao.findById(courseId).orElseThrow(() -> new EntityNotFoundException());
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
//        list=this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());

//        List<Course> result = new ArrayList<>();
//        for (Course e : this.list) {
//            if (e.getId() != courseId) {
//                result.add(e);
//            }
//        }
//        list = result;

        courseDao.deleteById(courseId);
    }

}
