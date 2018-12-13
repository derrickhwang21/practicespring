package com.hwang.practicespring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlbumController {
    @Autowired
    private AlbumRepository albumRepo;

    @RequestMapping(value = "/albums", method = RequestMethod.GET)
    public String index(Model m){
//        Album[] albums = new Album[]{
//                new Album("Abbey Road", 10, 2843),
//                new Album("Thriller", 7, 2539)
//        };


        m.addAttribute("albums", albumRepo.findAll());
        return "albumIndex";
    }
}
