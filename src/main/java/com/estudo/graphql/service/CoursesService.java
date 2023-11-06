package com.estudo.graphql.service;

import com.estudo.graphql.model.Category;
import com.estudo.graphql.model.Course;
import com.estudo.graphql.model.CourseCursor;
import com.estudo.graphql.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.OffsetScrollPosition;
import org.springframework.data.domain.ScrollPosition;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Window;
import org.springframework.stereotype.Service;

@Service
public class CoursesService {

    @Autowired
    private CourseRepository courseRepository;

    public Window<Course> getCoursesByCursor(CourseCursor courseCursor){

        if(courseCursor.getFirst() > 0 && courseCursor.getLast() > 0){
            throw new IllegalArgumentException("Cannot use both first and last");
        }


        OffsetScrollPosition offset = ScrollPosition.offset();
        return  courseRepository.findAllByCategory(Category.builder().id("5").build(),offset,Sort.by("name").ascending());
    }
}
