package com.estudo.graphql.controller;

import com.estudo.graphql.model.Category;
import com.estudo.graphql.repository.CategoryRepository;
import org.dataloader.DataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@Controller
@SchemaMapping(typeName="Category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;


    public LocalDate parseData(String data){
        return LocalDate.parse(data);
    }


    @QueryMapping
    public Category categoriesByField(@Argument String id, @Argument String name)
    {

     return categoryRepository.findById(id).orElseThrow();
    }

    @QueryMapping
    public Category categoriesUsingDataLoad(@Argument String id, DataLoader<String,Category> loader) {
        return  categoryRepository.findById(id).orElseThrow();
    }



}
