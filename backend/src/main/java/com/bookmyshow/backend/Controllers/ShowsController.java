package com.bookmyshow.backend.Controllers;

import com.bookmyshow.backend.Dtos.ApiResponse;
import com.bookmyshow.backend.Models.ShowsModel;
import com.bookmyshow.backend.Models.TheatresModel;
import com.bookmyshow.backend.Services.ShowsService;
import com.bookmyshow.backend.Services.TheatresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShowsController {
    @Autowired
    private ShowsService showsService;

    @GetMapping("/shows")
    public ResponseEntity<ApiResponse> getAllShows() {
        return showsService.getAllShows();
    }

    @GetMapping("/show/{id}")
    public ResponseEntity<ApiResponse> getShowById(@PathVariable long id) {
        return showsService.getShowById(id);
    }



    @PostMapping("/show")
    public ResponseEntity<ApiResponse> addShow(@RequestBody ShowsModel show) {
        return showsService.addShow(show);
    }


}
