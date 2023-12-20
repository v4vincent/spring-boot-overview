package com.example.mycoolap.common;

import org.springframework.stereotype.Component;

@Component
public class WritingTeacher implements Teacher{
    @Override
    public String getDailyHomework() {
        return "Write an essay with 10 sentences.";
    }
}
