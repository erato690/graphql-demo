package com.estudo.graphql.repository;

import com.estudo.graphql.model.Category;
import com.estudo.graphql.model.Course;
import org.springframework.data.domain.ScrollPosition;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Window;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;



public interface CourseRepository extends ListCrudRepository<Course,String>, QueryByExampleExecutor<Course> {

    Window<Course> findAllByCategory(Category category, ScrollPosition position, Sort sort);
}
