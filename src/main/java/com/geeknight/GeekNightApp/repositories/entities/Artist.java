package com.geeknight.GeekNightApp.repositories.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Map;

@Entity
@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="Artist")
public class Artist {

    @Id
    private long id;
    private String name;
    private long genre_id;
    private String genre_name;
    private long monthlyListeners;
    private boolean following;

    public Artist(long id, String name, long genre_id, String genre_name,
                  long monthlyListeners, boolean following) {
        this.id = id;
        this.name = name;
        this.genre_id = genre_id;
        this.genre_name = genre_name;
        this.monthlyListeners = monthlyListeners;
        this.following = following;
    }

    @JsonProperty("genre")
    private void unpackGenre(Map<String, Object> genre) {
        this.genre_id = (Long) genre.get("id");
        this.genre_name = (String) genre.get("name");
    }
}
