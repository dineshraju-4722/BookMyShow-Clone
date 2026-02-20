package com.bookmyshow.backend.Repositories;

import com.bookmyshow.backend.Models.AwardsModel;
import com.bookmyshow.backend.Models.OccupationsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AwardsRepository extends JpaRepository<AwardsModel,Long> {
    Optional<AwardsModel> findByAwardName(String awardName);
}
