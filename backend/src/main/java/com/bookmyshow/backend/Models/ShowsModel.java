package com.bookmyshow.backend.Models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "shows")
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonIdentityInfo
        (
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class ShowsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto-generates the ID valu
   private long id;

    private String showName;
    private String showTime;
    private String showDate;
    private String showType;
    private String showLanguage;
    private String showGenre;

    private double goldPrice;
    private double silverPrice;
    private double platinumPrice;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private MoviesModel moviesModel;

      @ManyToOne
      @JoinColumn(name = "theatre_id")
      private TheatresModel theatresModel;


    @Transient
    private long theatreId;
 @Transient
 private long movieId;
}
