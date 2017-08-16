package me.yling.springboot10.repositories;

import me.yling.springboot10.models.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository <Course, Long> {
}
