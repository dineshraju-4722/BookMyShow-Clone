package com.bookmyshow.backend.Repositories;

import com.bookmyshow.backend.Models.GenresModel;
import com.bookmyshow.backend.Models.LanguagesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenresRepository extends JpaRepository<GenresModel,Long> {
    GenresModel findByGenre(String genre);
}
