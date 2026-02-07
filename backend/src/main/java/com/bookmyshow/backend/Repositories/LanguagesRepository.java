package com.bookmyshow.backend.Repositories;

import com.bookmyshow.backend.Models.LanguagesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguagesRepository extends JpaRepository<LanguagesModel,Long> {
    LanguagesModel findByLanguage(String language);
}
