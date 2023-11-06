package com.estudo.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseCursor {

    private int first;
    private String before;
    private String after;
    private int last;
    private int limit;


}
