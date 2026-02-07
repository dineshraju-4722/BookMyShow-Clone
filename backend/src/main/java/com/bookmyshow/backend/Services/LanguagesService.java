package com.bookmyshow.backend.Services;

import com.bookmyshow.backend.Dtos.ApiResponse;
import com.bookmyshow.backend.Models.LanguagesModel;
import com.bookmyshow.backend.Repositories.LanguagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguagesService {

    @Autowired
    private LanguagesRepository languagesRepository;

    public ResponseEntity<ApiResponse> getAllLanguages(){
        return ResponseEntity.ok(new ApiResponse("Languages retrieved successfully",true,languagesRepository.findAll()));
    }

    public ResponseEntity<ApiResponse> getLanguageById(long id) {
        LanguagesModel lang=languagesRepository.findById(id).orElse(null);
        return lang!=null ? ResponseEntity.ok(new ApiResponse("Language found",true,lang)) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse("Language not found",false,null));
    }

    public ResponseEntity<ApiResponse> addLanguage(String language) {
        if (language == null || language.trim().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Language cannot be null or empty",false,null));
        }
        else if(languagesRepository.findByLanguage(language) != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(new ApiResponse("Language already exists",false,null));
        }

        LanguagesModel languageModel = new LanguagesModel();
        languageModel.language = language;
        languagesRepository.save(languageModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse("Language added successfully",true,null));
    }

}
