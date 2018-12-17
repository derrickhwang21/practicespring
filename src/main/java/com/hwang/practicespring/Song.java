package com.hwang.practicespring;

import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import java.util.List;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long id;
    public String title;
    public int length;
    public int trackNumber;

    @ManyToOne
    public Album album;

    public Song(){
    }

    public Song(String title, int length, int trackNumber){
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public String toString(){
        return this.title;
    }

}
