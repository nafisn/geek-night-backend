package com.geeknight.GeekNightApp.repositories;

import com.geeknight.GeekNightApp.repositories.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {
<<<<<<< HEAD
    Genre getGenreByName(String name);
=======
    Genre getGenreById(Long id);
>>>>>>> origin
}
