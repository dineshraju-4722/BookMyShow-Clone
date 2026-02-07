package com.bookmyshow.backend.Services;

import com.bookmyshow.backend.Dtos.ApiResponse;
import com.bookmyshow.backend.Dtos.MoviesPostDto;
import com.bookmyshow.backend.Models.GenresModel;
import com.bookmyshow.backend.Models.LanguagesModel;
import com.bookmyshow.backend.Models.MoviesModel;
import com.bookmyshow.backend.Repositories.GenresRepository;
import com.bookmyshow.backend.Repositories.LanguagesRepository;
import com.bookmyshow.backend.Repositories.MoviesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class MoviesService {

    @Autowired
    private MoviesRepository moviesRepository;
    @Autowired
    private GenresRepository genresRepository;
    @Autowired
    private LanguagesRepository languagesRepository;
    @Autowired
    private ModelMapper modelmapper;


    public ResponseEntity<ApiResponse> getAllMovies(){
        return ResponseEntity.ok(new ApiResponse("Movies retrieved successfully",true,moviesRepository.findAll()));
}

    public ResponseEntity<ApiResponse> getMovieById(long id) {
        MoviesModel movie =moviesRepository.findById(id).orElse(null);
        return movie!=null ? ResponseEntity.ok(new ApiResponse("Movie found",true,movie)) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse("Movie not found",false,null));
    }

    public ResponseEntity<ApiResponse> addMovie(MoviesPostDto movie) {
        if (movie.getTitle() == null || movie.getTitle().trim().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Movie title cannot be null or empty",false,null));
        }
        else if(moviesRepository.findByTitle(movie.getTitle()) != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(new ApiResponse("Movie with this title already exists",false,null));
        }
        MoviesModel mappedMovie=modelmapper.map(movie,MoviesModel.class);

        //genres
        mappedMovie.setGenresModelList(new HashSet<>());
        mappedMovie.setLanguagesModelList(new HashSet<>());

        if(movie.getGenreIds()==null || movie.getLanguageIds()==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Movie must have at least one genre and language",false,null));
        }


        for(long i:movie.getGenreIds()){
            GenresModel genre=genresRepository.findById(i).orElse(null);
            if(genre!=null){
                mappedMovie.getGenresModelList().add(genre);
            }
        }
        for(long i:movie.getLanguageIds()){
            LanguagesModel lang=languagesRepository.findById(i).orElse(null);
            if(lang!=null) {
                mappedMovie.getLanguagesModelList().add(lang);
            }
        }
        moviesRepository.save(mappedMovie);

        for(GenresModel genre:mappedMovie.getGenresModelList()){
            genre.getMoviesModelList().add(mappedMovie);
            genresRepository.save(genre);
        }
        //languages

        for(LanguagesModel lang:mappedMovie.getLanguagesModelList()){
            lang.getMoviesModelList().add(mappedMovie);
            languagesRepository.save(lang);
        }



            return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse("Movie added successfully",true,null));
    }

}
