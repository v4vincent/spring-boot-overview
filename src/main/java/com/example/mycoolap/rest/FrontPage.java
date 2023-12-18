package com.example.mycoolap.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontPage {

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

