package com.orange_evolution_backend.service;

import org.springframework.stereotype.Service;

import com.orange_evolution_backend.repository.CourseRepository;
import com.orange_evolution_backend.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StatisticAdminService {
    CourseRepository courseRepository;
    UserRepository userRepository;

    public Long counterUserDoing(Long idCourse) {
        return (long) courseRepository.findById(idCourse).get().getUserDoing().size();
    }

    public Long CounterUserDone(Long idcourse) {
        return (long) courseRepository.findById(idcourse).get().getUserDone().size();
    }

    public Long CounterUserDidnt(Long idCourse) {
        return (long) (userRepository.findAll().size() - (courseRepository.findById(idCourse).get().getUserDone().size()
                + courseRepository.findById(idCourse).get().getUserDoing().size()));
    }

    public Long CounterAllUsers(){
        return (long) userRepository.findAll().size();
    }
}
