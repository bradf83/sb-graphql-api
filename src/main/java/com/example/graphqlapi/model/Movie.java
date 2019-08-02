package com.example.graphqlapi.model;

import com.example.graphqlapi.model.common.CommonProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Movie extends CommonProperties {
    private String name;
    private String description;
    private int releaseYear;
    private String discFormat;
    private String bestSoundFormat;
    private String utlraHdFormat;
}
