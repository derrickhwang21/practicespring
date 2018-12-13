package com.hwang.practicespring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CapitalizeController {
    @RequestMapping(value = "/capitalize/{capitalize}", method = RequestMethod.GET)
    public String capitalize(@PathVariable String capitalize){
        return upperCase(capitalize);
    }

    public static String upperCase(String word){
        return word.toUpperCase();
    }
}
