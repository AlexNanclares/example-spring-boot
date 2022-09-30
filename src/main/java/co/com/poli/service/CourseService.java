package co.com.poli.service;

import co.com.poli.persistence.entity.Course;

import java.util.List;

public interface CourseService {

    Course save(Course course);
    List<Course> findAll();

}
