package com.bookmyshow.backend.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity(name = "genres")
@Getter
@Setter
@NoArgsConstructor
public class GenresModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto-generates the ID valu
   public long id;
    public String genre;


    @ManyToMany
    @JsonIgnore
        @JoinTable(
            name = "movie_genres",
            joinColumns = @JoinColumn(name = "genre_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id")
        )
    public Set<MoviesModel> moviesModelList;



}
