package com.hwang.practicespring;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String title;
    public int songCount;
    public int songLength;
    public String imageUrl;

    public Album(String title, int songCount, int songLength){
        this. title = title;
        this.songCount = songCount;
        this.songLength = songLength;
    }

    public Album() {}

    public String toString(){
        return title + " has this many " + songCount + " for this long " + songLength;
    }
}
