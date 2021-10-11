package br.com.lucas.crudsimples.crudSimples.service;

import br.com.lucas.crudsimples.crudSimples.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    Long count();
    List<Course> findAll();
    Course findById(Long id);
    void save(Course course);
    void delete(Long id);
}
