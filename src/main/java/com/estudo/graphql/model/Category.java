package com.estudo.graphql.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "CATEGORY")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Category {
    @Id
    private String id;
    private String name;
    private String description;

    @OneToMany
    @JoinColumn(name = "category_id")
    private Set<Course> courses;


}
