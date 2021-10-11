package br.com.lucas.crudsimples.crudSimples.repository;

import br.com.lucas.crudsimples.crudSimples.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    @Override
    List<Course> findAll();

    @Override
    <S extends Course> S save(S entity);

    @Override
    Optional<Course> findById(Long aLong);

    @Override
    long count();

    @Override
    void delete(Course entity);
}
