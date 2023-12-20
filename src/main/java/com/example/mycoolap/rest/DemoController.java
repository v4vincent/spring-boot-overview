package com.example.mycoolap.rest;

import com.example.mycoolap.common.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Teacher teacher;

    @Autowired
    public DemoController(Teacher teacher){
        this.teacher = teacher;
    }

    @GetMapping("/")
    public String getHomework(){
        return teacher.getDailyHomework();
    }

}
