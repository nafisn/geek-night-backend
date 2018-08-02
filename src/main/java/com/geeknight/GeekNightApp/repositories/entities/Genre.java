package com.geeknight.GeekNightApp.repositories.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
<<<<<<< HEAD
@Getter
@Setter
public class Genre {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
=======
@Getter @Setter
public class Genre {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
>>>>>>> origin
    private String name;
    
    public Genre(){}

}
