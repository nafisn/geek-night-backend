package com.geeknight.GeekNightApp.repositories;

import com.geeknight.GeekNightApp.repositories.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {

    Artist findArtist(long artistId);

    List<Album> getAllAlbums(long artistId);

    void update(Artist artist);

    voi
}
