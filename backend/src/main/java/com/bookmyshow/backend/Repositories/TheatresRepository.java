package com.bookmyshow.backend.Repositories;

import com.bookmyshow.backend.Models.LocationsModel;
import com.bookmyshow.backend.Models.TheatresModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatresRepository extends JpaRepository<TheatresModel,Long> {
    TheatresModel findByTheatreName(String locationName);
}
