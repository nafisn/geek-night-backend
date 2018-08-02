package com.geeknight.GeekNightApp.services;

import com.geeknight.GeekNightApp.repositories.ArtistRepository;
import com.geeknight.GeekNightApp.repositories.entities.Album;
import com.geeknight.GeekNightApp.repositories.entities.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    @Autowired
    ArtistRepository ar;

    public List<Artist> findAll() { return ar.findAll(); }

    public Artist findArtist(long artistId) { return findArtist(artistId); }

    public List<Album> findAllArtistAlbum(long artistId) { return findAllArtistAlbum(artistId); }

    public void update(Artist artist) { ar.update(artist); }

    public void save(Artist artist) { ar.save(artist); }

    public void delete(long artistId) { ar.deleteById(artistId); }

    public void follow(long artistId) { ar.follow(artistId); }

    public void unfollow(long artistId) { ar.unfollow(artistId); }
}
