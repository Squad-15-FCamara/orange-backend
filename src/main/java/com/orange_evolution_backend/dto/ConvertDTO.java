package com.orange_evolution_backend.dto;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

import com.orange_evolution_backend.entity.Course;
import com.orange_evolution_backend.entity.Road;
import com.orange_evolution_backend.entity.Theme;
import com.orange_evolution_backend.entity.Type;
import com.orange_evolution_backend.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ConvertDTO {
    ModelMapper modelMapper;

    public List<CourseDTO> converCoursesToListDTO(List<Course> courses){
        List<CourseDTO> returnCoursesDTO = new ArrayList<>();
        courses.forEach(course ->{
            returnCoursesDTO.add(modelMapper.map(course, CourseDTO.class));
        });
        return returnCoursesDTO;
    }

    public CourseDTO convertCourseToDTO(Course course){
        return modelMapper.map(course, CourseDTO.class);
    }
    public Course converCourseToEntity(CourseDTO courseDTO){
        return modelMapper.map(courseDTO, Course.class);
    }

    public List<UserDTO> converUsersToListDTO(List<User> users){
        List<UserDTO> returnUsersDTO = new ArrayList<>();
        users.forEach(user ->{
            returnUsersDTO.add(modelMapper.map(user, UserDTO.class));
        });
        return returnUsersDTO;
    }

    public UserDTO convertUserToDTO(User user){
        return modelMapper.map(user, UserDTO.class);
    }
    public User converUserToEntity(UserDTO userDTO){
        return modelMapper.map(userDTO, User.class);
    }

    public RoadDTO convertRoadToDTO(Road road){
        return modelMapper.map(road, RoadDTO.class);
    }

    public Road convertRoadToEntity(RoadDTO roadDTO){
        return modelMapper.map(roadDTO, Road.class);
    }

    public ThemeDTO convertThemeToDTO(Theme theme){
        return modelMapper.map(theme, ThemeDTO.class);
    }
    public Theme convertThemeToEntity(ThemeDTO themeDTO){
        return modelMapper.map(themeDTO, Theme.class);
    }

    public TypeDTO convertTypeToDTO(Type type){
        return modelMapper.map(type, TypeDTO.class);
    }
    public Type convertTypeToEntity(TypeDTO typeDTO){
        return modelMapper.map(typeDTO, Type.class );
    }

}
