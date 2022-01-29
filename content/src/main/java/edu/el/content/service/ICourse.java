package edu.el.content.service;

import edu.el.content.model.Content;
import edu.el.content.model.Course;

import java.util.List;

public interface ICourse {
        List<Course> getAll();
        void add(Course course);
        Course get(Long id);
        void update(Course course);
        void delete(long id);
        List<Content> findContentsForCourse(Long id);
        Content findContentsForCourse(Long id, Long contentId);
}
