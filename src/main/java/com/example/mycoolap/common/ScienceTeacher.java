package com.example.mycoolap.common;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{
    @Override
    public String getDailyHomework() {
        return "Let's do some experiment!";
    }
}
