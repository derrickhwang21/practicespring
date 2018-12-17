package com.hwang.practicespring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    @Autowired
    private AlbumRepository albumRepo;

    @Autowired
    private SongRepository songRepo;

    @RequestMapping(value = "/albums", method = RequestMethod.GET)
    public String index(Model m){
//        Album[] albums = new Album[]{
//                new Album("Abbey Road", 10, 2843),
//                new Album("Thriller", 7, 2539)
//        };


        m.addAttribute("albums", albumRepo.findAll());
        return "albumIndex";
    }

    @RequestMapping(value="/albums", method=RequestMethod.POST)
    public RedirectView create(@RequestParam String title,
                               @RequestParam String artist,
                               @RequestParam int songCount,
                               @RequestParam int length,
                               @RequestParam String imageUrl){
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        albumRepo.save(newAlbum);
        return new RedirectView("/albums");
    }

    @RequestMapping(value="/albums/{albumId}/show", method=RequestMethod.GET)
    public String show(@PathVariable long albumId, Model m) {
        m.addAttribute("album", albumRepo.findById(albumId).get());
        return "showAlbum";
    }

    @RequestMapping(value="/albums/{albumId}/songs", method= RequestMethod.POST)
    public RedirectView addSong(@PathVariable long albumId,
                                @RequestParam String title,
                                @RequestParam int length,
                                @RequestParam int trackNumber,
                                Model m){
        Song newSong = new Song(title, length, trackNumber);
        newSong.album = albumRepo.findById(albumId).get();
        songRepo.save(newSong);
        return new RedirectView("/albums");
    }
}
