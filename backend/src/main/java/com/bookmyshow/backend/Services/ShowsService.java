package com.bookmyshow.backend.Services;

import com.bookmyshow.backend.Dtos.ApiResponse;
import com.bookmyshow.backend.Models.LocationsModel;
import com.bookmyshow.backend.Models.MoviesModel;
import com.bookmyshow.backend.Models.ShowsModel;
import com.bookmyshow.backend.Models.TheatresModel;
import com.bookmyshow.backend.Repositories.LocationsRepository;
import com.bookmyshow.backend.Repositories.MoviesRepository;
import com.bookmyshow.backend.Repositories.ShowsRepository;
import com.bookmyshow.backend.Repositories.TheatresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ShowsService {

    @Autowired
    private ShowsRepository showsRepository;
    @Autowired
    private TheatresRepository theatresRepository;
    @Autowired
    private LocationsRepository locationsRepository;
    @Autowired
    private MoviesRepository moviesRepository;

    public ResponseEntity<ApiResponse> getAllShows(){
        return ResponseEntity.ok(new ApiResponse("Shows retrieved successfully",true,showsRepository.findAll()));
    }

    public ResponseEntity<ApiResponse> getShowById(long id) {
        var show=showsRepository.findById(id).orElse(null);
        return show!=null ? ResponseEntity.ok(new ApiResponse("Show found",true,show)) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse("Show not found",false,null));
    }

    public ResponseEntity<ApiResponse> addShow(ShowsModel show) {
        if (show.getShowName() == null || show.getShowName().trim().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Show name cannot be null or empty",false,null));
        }
        else if(show.getShowTime()==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Show time cannot be null",false,null));
        }
        TheatresModel theatre=theatresRepository.findById(show.getTheatreId()).orElse(null);
        MoviesModel movie=moviesRepository.findById(show.getMovieId()).orElse(null);
        if(theatre==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Invalid theatre ID",false,null));
        }
        else if(movie==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Invalid movie ID",false,null));
        }
        else if(showsRepository.findByTheatresModel_TheatreNameAndTheatresModel_Location_LocationNameAndShowTime(
                theatre.getTheatreName(),
                theatre.getLocation().getLocationName(),
                show.getShowTime()
        ) != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(new ApiResponse("Show with this name already exists",false,null));
        }

        show.setTheatresModel(theatre);
        show.setMoviesModel(movie);

        showsRepository.save(show);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse("Show added successfully",true,null));
    }





}
