package com.bookmyshow.backend.Controllers;

import com.bookmyshow.backend.Dtos.ApiResponse;
import com.bookmyshow.backend.Models.AwardsModel;
import com.bookmyshow.backend.Models.GenresModel;
import com.bookmyshow.backend.Models.OccupationsModel;
import com.bookmyshow.backend.Models.PersonsModel;
import com.bookmyshow.backend.Services.GenresService;
import com.bookmyshow.backend.Services.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonsController {
    @Autowired
    private PersonsService personsService;


    @GetMapping("/persons")
    public ResponseEntity<ApiResponse> getAllPersons() {
        return personsService.getAllPersons();
    }

    @GetMapping("/persons/{id}")
    public ResponseEntity<ApiResponse> getPersonById(@PathVariable long id) {
        return personsService.getPersonById(id);
    }

    @PostMapping("/persons")
    public ResponseEntity<ApiResponse> addPerson(@RequestBody PersonsModel person) {
        return personsService.addPerson(person);
    }

    @GetMapping("/occupations")
    public ResponseEntity<ApiResponse> getAllOccupations() {
        return personsService.getAllOccupatoins();
    }

    @GetMapping("/occupations/{id}")
    public ResponseEntity<ApiResponse> getOccupationById(@PathVariable long id) {
        return personsService.getOccupationById(id);

    }

    @PostMapping("/occupations")
    public ResponseEntity<ApiResponse> addOccupation(@RequestBody OccupationsModel occupation) {
        return personsService.addOccupation(occupation);
    }

        @GetMapping("/awards")
    public ResponseEntity<ApiResponse> getAllAwards() {
            return personsService.getAllAwards();
        }

    @GetMapping("/awards/{id}")
    public ResponseEntity<ApiResponse> getAwardById(@PathVariable long id) {
        return personsService.getAwardById(id);
    }

    @PostMapping("/awards")
    public ResponseEntity<ApiResponse> addAward(@RequestBody AwardsModel award) {
        return personsService.addAward(award);
    }
}
