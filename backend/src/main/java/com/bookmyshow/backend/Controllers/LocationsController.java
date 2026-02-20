package com.bookmyshow.backend.Controllers;

import com.bookmyshow.backend.Dtos.ApiResponse;
import com.bookmyshow.backend.Models.GenresModel;
import com.bookmyshow.backend.Models.LocationsModel;
import com.bookmyshow.backend.Services.GenresService;
import com.bookmyshow.backend.Services.LocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationsController {
    @Autowired
    private LocationsService locationsService;

    @GetMapping("/locations")
    public ResponseEntity<ApiResponse> getAllGenres(){
          return locationsService.getAllLocations();
    }

    @GetMapping("/location/{id}")
    public ResponseEntity<ApiResponse> getLocationById(@PathVariable long id) {
        return locationsService.getLocationById(id);
    }

    @PostMapping("/location")
    public ResponseEntity<ApiResponse> addLocation(@RequestBody LocationsModel location) {
        return locationsService.addLocation(location);
    }


}
