package io.javabrains.springbootstarter.domain._3_lesson;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class LessonService {

    private final LessonRepository lessonRepository;

    public List<Lesson> getAllLessons(String courseId) {
        return lessonRepository.findByCourseId(courseId);
    }

    public Lesson getLesson(String id) {
        return lessonRepository.findOne(id);
    }

    public void addLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public void updateLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public void deleteLesson(String id) {
        lessonRepository.delete(id);
    }
}
