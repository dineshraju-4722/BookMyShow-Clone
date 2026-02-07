package com.bookmyshow.backend.Controllers;

import com.bookmyshow.backend.Dtos.ApiResponse;
import com.bookmyshow.backend.Models.LanguagesModel;
import com.bookmyshow.backend.Services.LanguagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LanguagesController {
    @Autowired
    private LanguagesService languagesService;

    @GetMapping("/languages")
    public ResponseEntity<ApiResponse> getAllLanguages(){
          return languagesService.getAllLanguages();
    }

    @GetMapping("/language/{id}")
    public ResponseEntity<ApiResponse> getLanguageById(@PathVariable long id) {
        return languagesService.getLanguageById(id);
    }


    @PostMapping("/language")
    public ResponseEntity<ApiResponse> addLanguage(@RequestBody LanguagesModel language) {
        return languagesService.addLanguage(language.getLanguage());
    }


}
