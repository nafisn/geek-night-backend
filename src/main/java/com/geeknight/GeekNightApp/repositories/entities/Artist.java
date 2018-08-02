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
    Long id;
    String name;
    



    @JsonProperty("genre")
    private void unpackGenre(Map<String, Object> genre)
}
