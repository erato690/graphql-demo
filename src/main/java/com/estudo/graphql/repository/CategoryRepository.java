package com.estudo.graphql.repository;

import com.estudo.graphql.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,String> {
}
