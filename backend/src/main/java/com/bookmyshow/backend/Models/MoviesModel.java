package com.bookmyshow.backend.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "movies")
@Getter
@Setter
@NoArgsConstructor
public class MoviesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto-generates the ID valu
   private long id;
    private String title;

   private LocalDateTime releaseDate;

    @ManyToMany
    @JoinTable(
        name = "movie_languages",
        joinColumns = @JoinColumn(name = "movie_id"),
        inverseJoinColumns = @JoinColumn(name = "language_id")
    )
    private Set<LanguagesModel> languagesModelList;

    @ManyToMany
    @JoinTable(
        name = "movie_genres",
        joinColumns = @JoinColumn(name = "movie_id"),
        inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    public Set<GenresModel> genresModelList;

}
