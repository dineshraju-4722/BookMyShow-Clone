package com.bookmyshow.backend.Repositories;

import com.bookmyshow.backend.Models.ShowsModel;
import com.bookmyshow.backend.Models.TheatresModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowsRepository extends JpaRepository<ShowsModel,Long> {

        List<ShowsModel> findByMoviesModel_TitleAndTheatresModel_TheatreNameAndTheatresModel_Location_LocationName(
                String movieName,
                String theatreName,
                String locationName
        );

        ShowsModel findByTheatresModel_TheatreNameAndTheatresModel_Location_LocationNameAndShowTime(String theatreName,
                                                                                                    String locationName,
                                                                                                    String showTime);
        List<ShowsModel> findByShowDateAndTheatresModel_Location_LocationNameAndMoviesModel_Title(String showDate, String locationName, String movieName);
    }
