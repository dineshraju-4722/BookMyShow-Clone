package com.bookmyshow.backend.Services;

import com.bookmyshow.backend.Dtos.ApiResponse;
import com.bookmyshow.backend.Models.GenresModel;
import com.bookmyshow.backend.Models.LanguagesModel;
import com.bookmyshow.backend.Repositories.GenresRepository;
import com.bookmyshow.backend.Repositories.LanguagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GenresService {

    @Autowired
    private GenresRepository genreRepository;

    public ResponseEntity<ApiResponse> getAllGenres(){
        return ResponseEntity.ok(new ApiResponse("Genres retrieved successfully",true,genreRepository.findAll()));
    }

    public ResponseEntity<ApiResponse> getGenreById(long id) {
        GenresModel genre=genreRepository.findById(id).orElse(null);
        return genre!=null ? ResponseEntity.ok(new ApiResponse("Genre found",true,genre)) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse("Genre not found",false,null));
    }

    public ResponseEntity<ApiResponse> addGenre(String genre) {
        if (genre == null || genre.trim().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Genre cannot be null or empty",false,null));
        }
        else if(genreRepository.findByGenre(genre) != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(new ApiResponse("Genre already exists",false,null));
        }

        GenresModel genreModel = new GenresModel();
        genreModel.genre = genre;
        genreRepository.save(genreModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse("Genre added successfully",true,null));
    }

}
