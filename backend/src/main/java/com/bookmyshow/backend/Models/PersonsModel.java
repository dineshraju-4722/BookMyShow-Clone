package com.bookmyshow.backend.Models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity(name = "persons")
@Getter
@Setter
@NoArgsConstructor
@JsonIdentityInfo
        (
                generator = ObjectIdGenerators.PropertyGenerator.class,
                property = "id"
        )
public class PersonsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto-generates the ID valu
   private long id;
    private String firstName;
    private String lastName;
    private String role; // e.g., Actor, Director, Producer
    private String bio;
    private String dateOfBirth;
    private String nationality;
    private String awards; // e.g., "Oscar, Golden Globe"
    private String spouse;
    private String children; // e.g., "Child1, Child2"
    private String birthPlace;
    private String imageUrl;

    @ManyToMany
    @JoinTable(
            name = "persons_awards",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "award_id")
    )
    private List<AwardsModel> awardsReceived;

    @ManyToMany
    @JoinTable(
            name = "persons_occupations",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "occupation_id")
    )
    private List<OccupationsModel> occupations;


    @Transient
 List<Integer> awardsReceivedIds;

    @Transient
    List<Integer> occupationIds;

}
