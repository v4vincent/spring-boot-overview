package com.example.mycoolap.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontPage {

    //inject properties from application.properties
    //spouse.name and spouse.age
    @Value("${spouse.name}")
    private String spouseName;

    @Value("${spouse.age}")
    private int spouseAge;

    // expose a new endpoint for spouse info

    @GetMapping("/spouseinfo")
    public String getSpouseName(){
        return "My wife is " + spouseName + " and she is " + spouseAge + " years old.";
    }






    @GetMapping("/")
    public String frontPage(){
        return "Extra ecclesiam nulla salus";
    }

    // expose a new endpoint for workout

    @GetMapping("/workout")
    public String anotherMessage(){
        return "I'm awesome";
    }

    // expose another endpoint

    @GetMapping("/prayer")
    public String ourFather(){
        return "Our Father, who art in heaven";
    }

    @GetMapping("/spouse")
    public String spouse(){
        return "Nicole Vermillion";
    }





}

