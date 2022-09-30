package co.com.poli.service;

import co.com.poli.persistence.entity.Instructor;

import java.util.List;

public interface InstructorService {

    Instructor save(Instructor instructor);
    List<Instructor> findAll();

}
