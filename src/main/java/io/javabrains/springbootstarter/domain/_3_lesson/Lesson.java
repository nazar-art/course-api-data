package io.javabrains.springbootstarter.domain._3_lesson;

import io.javabrains.springbootstarter.domain._2_course.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Lesson {

	@Id
	private String id;
	private String name;
	private String description;
    @ManyToOne
    private Course course;

	public Lesson(String id, String name, String description, String courseId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
        course = new Course(courseId, "", "", "");
    }

    /*public Lesson(String id, String name, String description, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
        this.course = course;
    }*/
}
