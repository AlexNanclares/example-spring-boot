package co.com.poli.service;

import co.com.poli.persistence.entity.Course;
import co.com.poli.persistence.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService{

    private final CourseRepository courseRepository;


    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }
}
