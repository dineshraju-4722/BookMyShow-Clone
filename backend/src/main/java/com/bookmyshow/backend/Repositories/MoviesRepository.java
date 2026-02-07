package com.bookmyshow.backend.Repositories;

import com.bookmyshow.backend.Models.GenresModel;
import com.bookmyshow.backend.Models.MoviesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends JpaRepository<MoviesModel,Long> {
    MoviesModel findByTitle(String title);
}
