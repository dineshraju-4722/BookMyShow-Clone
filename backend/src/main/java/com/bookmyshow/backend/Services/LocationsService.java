package com.bookmyshow.backend.Services;

import com.bookmyshow.backend.Dtos.ApiResponse;
import com.bookmyshow.backend.Models.GenresModel;
import com.bookmyshow.backend.Models.LanguagesModel;
import com.bookmyshow.backend.Models.LocationsModel;
import com.bookmyshow.backend.Repositories.GenresRepository;
import com.bookmyshow.backend.Repositories.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LocationsService {

    @Autowired
    private LocationsRepository locationsRepository;

    public ResponseEntity<ApiResponse> getAllLocations(){
            return ResponseEntity.ok(new ApiResponse("Locations retrieved successfully",true,locationsRepository.findAll()));
    }
    public ResponseEntity<ApiResponse> getLocationById(long id) {
        var location=locationsRepository.findById(id).orElse(null);
        return location!=null ? ResponseEntity.ok(new ApiResponse("Location found",true,location)) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse("Location not found",false,null));
    }

    public ResponseEntity<ApiResponse> addLocation(LocationsModel location) {
        if (location.getLocationName() == null || location.getLocationName().trim().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Location cannot be null or empty",false,null));
        }
        else if(locationsRepository.findByLocationName(location.getLocationName()) != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(new ApiResponse("Location already exists",false,null));
        }

        LocationsModel locationModel = new LocationsModel();
        locationModel.setLocationName(location.getLocationName());
        locationModel.setPinCode(location.getPinCode());
        locationsRepository.save(locationModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse("Location added successfully",true,null));
    }




}
