package com.bookmyshow.backend.Dtos;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
public class MoviesPostDto {
    private String title;
    private Set<Integer> languageIds;
    private Set<Integer> genreIds;
    private LocalDateTime releaseDate;
}
