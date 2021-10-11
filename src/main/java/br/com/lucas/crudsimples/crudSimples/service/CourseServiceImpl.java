package br.com.lucas.crudsimples.crudSimples.service;

import br.com.lucas.crudsimples.crudSimples.model.Course;
import br.com.lucas.crudsimples.crudSimples.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Long count() {
        return courseRepository.count();
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void delete(Long id) {
        Optional<Course> courseOptional = courseRepository.findById(id);
        //if (courseOptional.isPresent()) {
        //    courseRepository.delete(courseOptional.get());
        //}
        courseOptional.ifPresent(courseRepository::delete);
    }
}
