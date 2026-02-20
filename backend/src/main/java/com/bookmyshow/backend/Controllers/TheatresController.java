package com.bookmyshow.backend.Controllers;

import com.bookmyshow.backend.Dtos.ApiResponse;
import com.bookmyshow.backend.Dtos.MoviesPostDto;
import com.bookmyshow.backend.Models.TheatresModel;
import com.bookmyshow.backend.Services.MoviesService;
import com.bookmyshow.backend.Services.TheatresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TheatresController {
    @Autowired
    private TheatresService theatresService;

    @GetMapping("/theatres")
    public ResponseEntity<ApiResponse> getAllTheatres() {
        return theatresService.getAllTheatres();
    }

    @GetMapping("/theatre/{id}")
    public ResponseEntity<ApiResponse> getTheatreById(@PathVariable long id) {
        return theatresService.getTheatreById(id);
    }

    @PostMapping("/theatre")
    public ResponseEntity<ApiResponse> addTheatre(@RequestBody TheatresModel theatre) {
        return theatresService.addTheatre(theatre);
    }


}
