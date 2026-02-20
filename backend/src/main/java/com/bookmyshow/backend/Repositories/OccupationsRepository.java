package com.bookmyshow.backend.Repositories;

import com.bookmyshow.backend.Models.GenresModel;
import com.bookmyshow.backend.Models.OccupationsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OccupationsRepository extends JpaRepository<OccupationsModel,Long> {
    OccupationsModel findByOccupationName(String occupationName);
}
