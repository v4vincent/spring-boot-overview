package com.example.mycoolap.common;

import org.springframework.stereotype.Component;

@Component
public class ReadingTeacher implements Teacher{
    @Override
    public String getDailyHomework() {
        return "Read 50 pages from the novel.";
    }
}
