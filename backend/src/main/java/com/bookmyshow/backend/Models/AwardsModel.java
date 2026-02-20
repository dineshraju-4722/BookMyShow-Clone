package com.bookmyshow.backend.Models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "awards")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo
        (
                generator = ObjectIdGenerators.PropertyGenerator.class,
                property = "id"
        )
public class AwardsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto-generates the ID valu
   private long id;
    private String awardName;
    private String description;

    @ManyToMany(mappedBy = "awardsReceived", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PersonsModel> recipients;




}
