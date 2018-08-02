package com.geeknight.GeekNightApp.api;


import com.geeknight.GeekNightApp.repositories.entities.Artist;
import com.geeknight.GeekNightApp.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ArtistController {

    @Autowired
    ArtistService artistS;


    @GetMapping("/artist")
    public List<Artist> getAllArtist() {
        return artistS.findAll();
    }

    @GetMapping("/artist/{artistId}")
    public Artist getArtist(@PathVariable long artistId) {
        return artistS.findArtist(artistId);
    }

    @GetMapping("/artist/{artistId}/albums")
    public List<Album> getAllAlbums(@PathVariable long artistId){
        return artistS.findAllArtistAlbum(artistId);
    }

    @PutMapping("/artist/{artistId")
    public String updateArtist(@PathVariable long artistId, @RequestBody Artist artist) {
        artistS.update(artist);
        return "Artist has been updated";
    }

    @PostMapping("/artist")
    public String createArtist(@RequestBody Artist artist) {
        artistS.save(artist);
        return "Artist has been posted";
    }

    @DeleteMapping("/artist/{artistId}")
    public String deleteArtist(@PathVariable long artistId) {
        artistS.delete(artistId);
        return "Artist has been deleted";
    }

    @PostMapping("/artist/{artistId}/follow")
    public String followArtist(@PathVariable long artistId, @RequestBody Artist artist) {
        artistS.follow(artistId);
        return "Followed!";
    }

    @DeleteMapping("/artist/{aristId}/follow")
    public String unfollowArtist(@PathVariable long artistId) {
        artistS.unfollow(artistId);
        return "Unfollowed";
    }

}
