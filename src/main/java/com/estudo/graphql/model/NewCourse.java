package com.estudo.graphql.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewCourse {

    @NotNull
    private String id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    private String categoryId ;
}
