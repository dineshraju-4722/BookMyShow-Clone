package com.bookmyshow.backend.Services;

import com.bookmyshow.backend.Dtos.ApiResponse;
import com.bookmyshow.backend.Models.GenresModel;
import com.bookmyshow.backend.Models.LocationsModel;
import com.bookmyshow.backend.Models.TheatresModel;
import com.bookmyshow.backend.Repositories.GenresRepository;
import com.bookmyshow.backend.Repositories.LocationsRepository;
import com.bookmyshow.backend.Repositories.TheatresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TheatresService {

    @Autowired
    private TheatresRepository theatresRepository;
    @Autowired
    private LocationsRepository locationsRepository;

    public ResponseEntity<ApiResponse> getAllTheatres(){
        return ResponseEntity.ok(new ApiResponse("Theatres retrieved successfully",true,theatresRepository.findAll()));
    }

    public ResponseEntity<ApiResponse> getTheatreById(long id) {
        TheatresModel theatre=theatresRepository.findById(id).orElse(null);
        return theatre!=null ? ResponseEntity.ok(new ApiResponse("Theatre found",true,theatre)) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse("Theatre not found",false,null));
    }

    public ResponseEntity<ApiResponse> addTheatre(TheatresModel theatre) {
        if (theatre.getTheatreName() == null || theatre.getTheatreName().trim().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Theatre name cannot be null or empty",false,null));
        }
        else if(theatresRepository.findByTheatreName(theatre.getTheatreName()) != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(new ApiResponse("Theatre with this name already exists",false,null));
        }

        long locid=theatre.getLocationId();
        LocationsModel lm=locationsRepository.findById(locid).orElse(null);
        if(lm==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Invalid location ID",false,null));
        }
        theatre.setLocation(lm);
        theatresRepository.save(theatre);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse("Theatre added successfully",true,null));
       }

}
