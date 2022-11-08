package com.orange_evolution_backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.orange_evolution_backend.entity.Course;
import com.orange_evolution_backend.repository.CourseRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CourseService {
    CourseRepository courseRepository;

    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

    public Course findCourseByID(Long idCourse) {
        return courseRepository.findById(idCourse)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Este material não existe"));
    }

    public Course saveCourse(Course course) {
        courseRepository.save(course);
        return course;
    }

    public List<Course> findCourseByTime(Long time) {
        List<Course> returnCourse = new ArrayList<>();
        findAllCourses().stream().forEach(course ->{
            if(course.getTime() >= time){
                returnCourse.add(course);
            }
        });
        return returnCourse;
    }

    public List<Course> findCourseByTag(String tag) {
        List<Course> returnCourse = new ArrayList<>();
        findAllCourses().stream().forEach(course -> {
            if(course.getTags().contains(tag)){
                returnCourse.add(course);
            }            
        });
        return returnCourse;
    }

    public List<Course> findCourseByRoad(String road){
        return courseRepository.findByRoad(road);
    }

    public List<Course> findCourseByTheme(String theme){
        return courseRepository.findByTheme(theme);
        }
    
    public List<Course> findCoursesByAuthor(String author){
        return courseRepository.findByauthor(author);
    }

    public List<Course> findCoursesByType(String type){
        return courseRepository.findByType(type);
    }
    
    public void deleteCourse(Long courseId) {
    	courseRepository.deleteById(courseId);
    }

}
