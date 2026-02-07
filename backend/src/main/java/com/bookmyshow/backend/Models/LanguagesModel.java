package com.bookmyshow.backend.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "languages")
@Getter
@Setter
@NoArgsConstructor
public class LanguagesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto-generates the ID valu
   public long id;
    public String language;

    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "movie_languages",
            joinColumns = @JoinColumn(name = "language_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id")
        )
    public Set<MoviesModel> moviesModelList;
}
