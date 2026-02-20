package com.bookmyshow.backend.Repositories;

import com.bookmyshow.backend.Models.AwardsModel;
import com.bookmyshow.backend.Models.PersonsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepository extends JpaRepository<PersonsModel,Long> {
    PersonsModel findByFirstNameAndLastName(String firstName, String lastName);
}
