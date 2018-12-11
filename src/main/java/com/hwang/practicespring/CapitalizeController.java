package com.hwang.practicespring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapitalizeController {
    @RequestMapping("/capitalize/{capitalize}")
    public String capitalize(@PathVariable String capitalize){
        return upperCase(capitalize);
    }

    public static String upperCase(String word){
        return word.toUpperCase();
    }
}
