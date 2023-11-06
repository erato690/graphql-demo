package com.estudo.graphql.controller;


import com.estudo.graphql.model.Category;
import com.estudo.graphql.model.Course;
import com.estudo.graphql.model.CourseCursor;
import com.estudo.graphql.model.NewCourse;
import com.estudo.graphql.repository.CourseRepository;
import com.estudo.graphql.service.CoursesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Window;
import org.springframework.graphql.data.method.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@SchemaMapping(typeName = "Courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CoursesService coursesService;

    @QueryMapping
    public List<Course> coursesByField(@Arguments Course course) {


        ExampleMatcher matcher = ExampleMatcher.matching()

                .withIgnoreNullValues();


        Example<Course> example = Example.of(course, matcher);

        return (List<Course>) courseRepository.findAll(example);
    }

    @MutationMapping(name = "createCourse")
    //O nome do argumento deve ser o mesmo do tipo definido no schema
    public Course create(@Valid @Argument NewCourse input) {


        var newCourse = Course.builder().id(input.getId()).name(input.getName()).description(input.getDescription()).category(Category.builder().id(input.getCategoryId()).build()).build();


        return courseRepository.save(newCourse);


    }
    @QueryMapping
    public Window<Course> coursesByCursor(@Arguments CourseCursor course) {

        return coursesService.getCoursesByCursor(course);
    }



}
