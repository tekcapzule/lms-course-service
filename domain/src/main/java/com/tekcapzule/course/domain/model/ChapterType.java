package com.tekcapzule.course.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ChapterType {
    CONTENT("Video"),
    QUIZ("Audio"),
    ASSIGNMENT("Pdf"),
    LAB("lab");

    @Getter
    private String value;
}