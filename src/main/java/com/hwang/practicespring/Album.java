package com.hwang.practicespring;

import javax.persistence.*;
import java.util.List;

/**
 * Album model
 */
@Entity
public class Album {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String title;
    public int songCount;
    public int songLength;
    public String imageUrl;
    public String artist;

    @OneToMany(mappedBy="album")
    public List<Song> songs;

    /**
     * constructor for Album model
     */
    public Album(String title, String artist, int songCount, int songLength, String imageUrl){
        this. title = title;
        this.songCount = songCount;
        this.songLength = songLength;
        this.artist =  artist;
        this.imageUrl = imageUrl;
    }

    /**
     * Default Constructor
     */
    public Album() {}

    public String toString(){
        return title;
    }
}
