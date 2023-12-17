package com.example.mycoolap.rest;

import org.springframework.web.bind.annotation.GetMapping;

public class FrontPage {
    @GetMapping("/")
    public String frontPage(){
        return "Extra ecclesiam nulla salus";
    }
}
