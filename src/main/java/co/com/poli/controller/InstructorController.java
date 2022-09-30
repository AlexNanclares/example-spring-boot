package co.com.poli.controller;

import co.com.poli.persistence.entity.Course;
import co.com.poli.persistence.entity.Instructor;
import co.com.poli.persistence.repository.InstructorRepository;
import co.com.poli.service.CourseService;
import co.com.poli.service.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructors")
@RequiredArgsConstructor
public class InstructorController {

    private final InstructorService instructorService;

    @PostMapping
    public Instructor save(@RequestBody Instructor instructor) {
        return this.instructorService.save(instructor);
    }

    @GetMapping
    public List<Instructor> findAll() {
        return this.instructorService.findAll();
    }
}
