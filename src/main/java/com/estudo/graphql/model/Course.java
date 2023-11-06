package com.estudo.graphql.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "COURSE")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Course{
        @Id
        @NotNull
        private String id;

        @NotNull
        private String name;
        @NotNull
        private String description;

        @NotNull
        @ManyToOne
        @JoinColumn(name="category_id", nullable=false)
        private Category category ;

}
