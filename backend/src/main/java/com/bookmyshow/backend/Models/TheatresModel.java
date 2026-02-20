package com.bookmyshow.backend.Models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "theatres")
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonIdentityInfo
        (
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class TheatresModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto-generates the ID valu
   private long id;

    private String theatreName;
    private String city;
    private  String state;
    private String country;
    private String address;
    private String contactNumber;
    private String email;
    private String managerName;
    private String managerContact;
    private String managerEmail;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private LocationsModel location ;



    private int totalSeats;
    private int availableSeats;
    private int goldSeatsStartRow;
    private int goldSeatsEndRow;
    private int silverSeatsStartRow;
    private int silverSeatsEndRow;
    private int platinumSeatsStartRow;
    private int platinumSeatsEndRow;

 @OneToMany(mappedBy = "theatresModel")
 private List<ShowsModel> shows;

    @Transient
    private long locationId;
}
