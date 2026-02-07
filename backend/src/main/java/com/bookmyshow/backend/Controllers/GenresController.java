package com.bookmyshow.backend.Controllers;

import com.bookmyshow.backend.Dtos.ApiResponse;
import com.bookmyshow.backend.Models.GenresModel;
import com.bookmyshow.backend.Services.GenresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GenresController {
    @Autowired
    private GenresService genreService;

    @GetMapping("/genres")
    public ResponseEntity<ApiResponse> getAllGenres(){
          return genreService.getAllGenres();
    }

    @GetMapping("/genre/{id}")
    public ResponseEntity<ApiResponse> getGenreById(@PathVariable long id) {
        return genreService.getGenreById(id);
    }

    @PostMapping("/genre")
    public ResponseEntity<ApiResponse> addGenre(@RequestBody GenresModel genre) {
        return genreService.addGenre(genre.getGenre());
    }


}
