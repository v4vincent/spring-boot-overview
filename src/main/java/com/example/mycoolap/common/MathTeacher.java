package com.example.mycoolap.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher{
    @Override
    public String getDailyHomework() {
        return "Do multiplication!";
    }
}
