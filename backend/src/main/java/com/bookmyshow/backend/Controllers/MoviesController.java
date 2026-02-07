package com.bookmyshow.backend.Controllers;

import com.bookmyshow.backend.Dtos.ApiResponse;
import com.bookmyshow.backend.Dtos.MoviesPostDto;
import com.bookmyshow.backend.Models.GenresModel;
import com.bookmyshow.backend.Models.MoviesModel;
import com.bookmyshow.backend.Services.GenresService;
import com.bookmyshow.backend.Services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MoviesController {
    @Autowired
    private MoviesService moviesService;

    @GetMapping("/movies")
    public ResponseEntity<ApiResponse> getAllGenres(){
          return moviesService.getAllMovies();
    }

    @GetMapping("/movie/{id}")
    public ResponseEntity<ApiResponse> getMovieById(@PathVariable long id) {
        return moviesService.getMovieById(id);
    }

    @PostMapping("/movie")
    public ResponseEntity<ApiResponse> addMovie(@RequestBody MoviesPostDto movie) {
        return moviesService.addMovie(movie);
    }


}
