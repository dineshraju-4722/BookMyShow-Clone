package com.bookmyshow.backend.Services;

import com.bookmyshow.backend.Dtos.ApiResponse;
import com.bookmyshow.backend.Models.AwardsModel;
import com.bookmyshow.backend.Models.GenresModel;
import com.bookmyshow.backend.Models.OccupationsModel;
import com.bookmyshow.backend.Models.PersonsModel;
import com.bookmyshow.backend.Repositories.AwardsRepository;
import com.bookmyshow.backend.Repositories.GenresRepository;
import com.bookmyshow.backend.Repositories.OccupationsRepository;
import com.bookmyshow.backend.Repositories.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonsService {

    @Autowired
    private PersonsRepository personsRepository;

        @Autowired
    private OccupationsRepository occupationsRepository;

    @Autowired
    private AwardsRepository awardsRepository;

    public ResponseEntity<ApiResponse> getAllPersons(){
        return ResponseEntity.ok(new ApiResponse("Persons retrieved successfully",true,personsRepository.findAll()));
    }

    public ResponseEntity<ApiResponse> getPersonById(long id) {
        var person=personsRepository.findById(id).orElse(null);
        return person!=null ? ResponseEntity.ok(new ApiResponse("Person found",true,person)) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse("Person not found",false,null));
    }

    public ResponseEntity<ApiResponse> addPerson(PersonsModel person) {
        if (person.getFirstName() == null || person.getFirstName().trim().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Person name cannot be null or empty",false,null));
        }

        for(long occupationId : person.getOccupationIds()) {
           OccupationsModel occ= occupationsRepository.findById(occupationId).orElse(null);
            if(occ == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Invalid occupation ID: " + occupationId,false,null));
            }
            person.getOccupations().add(occ);

        }

        for(long awardId : person.getAwardsReceivedIds()) {
           var award= awardsRepository.findById(awardId).orElse(null);
            if(award == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Invalid award ID: " + awardId,false,null));
            }
            person.getAwardsReceived().add(award);
        }
        personsRepository.save(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse("Person added successfully",true,null));
    }


    public ResponseEntity<ApiResponse> getAllOccupatoins(){
       return ResponseEntity.ok(new ApiResponse("Occupations retrieved successfully",true,occupationsRepository.findAll()));
    }

    public ResponseEntity<ApiResponse> getOccupationById(long id) {
        var occupation=occupationsRepository.findById(id).orElse(null);
        return occupation!=null ? ResponseEntity.ok(new ApiResponse("Occupation found",true,occupation)) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse("Occupation not found",false,null));
    }

     public ResponseEntity<ApiResponse> addOccupation(OccupationsModel occupation) {
        if (occupation.getOccupationName() == null || occupation.getOccupationName().trim().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Occupation name cannot be null or empty",false,null));
        }

        occupationsRepository.save(occupation);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse("Occupation added successfully",true,null));
    }

    public ResponseEntity<ApiResponse> getAllAwards(){
       return ResponseEntity.ok(new ApiResponse("Awards retrieved successfully",true,awardsRepository.findAll()));
    }

    public ResponseEntity<ApiResponse> getAwardById(long id) {
        var award=awardsRepository.findById(id).orElse(null);
        return award!=null ? ResponseEntity.ok(new ApiResponse("Award found",true,award)) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse("Award not found",false,null));
    }

     public ResponseEntity<ApiResponse> addAward(AwardsModel award) {

        if (award.getAwardName() == null || award.getAwardName().trim().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Award name cannot be null or empty",false,null));
        }
         AwardsModel awardName=awardsRepository.findByAwardName(award.getAwardName()).orElse(null);

        if (awardName != null ){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("Award name already exists",false,null));
         }

        awardsRepository.save(award);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse("Award added successfully",true,null));
     }
}





