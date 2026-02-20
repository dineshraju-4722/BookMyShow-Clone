package com.bookmyshow.backend.Models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "occupations")
@Getter
@Setter
@NoArgsConstructor
@JsonIdentityInfo
        (
                generator = ObjectIdGenerators.PropertyGenerator.class,
                property = "id"
        )
public class OccupationsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto-generates the ID valu
   private long id;

    private String occupationName;

        @ManyToMany(mappedBy = "occupations", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PersonsModel> personsList;




}
