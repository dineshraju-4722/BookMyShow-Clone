package com.bookmyshow.backend.Repositories;

import com.bookmyshow.backend.Models.GenresModel;
import com.bookmyshow.backend.Models.LocationsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationsRepository extends JpaRepository<LocationsModel,Long> {
    LocationsModel findByLocationName(String locationName);
}
