package io.javabrains.springbootstarter.domain._3_lesson;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LessonRepository extends CrudRepository<Lesson, String> {

    List<Lesson> findByName(String name);

    List<Lesson> findByDescription(String description);

    List<Lesson> findByCourseId(String courseId);
}
