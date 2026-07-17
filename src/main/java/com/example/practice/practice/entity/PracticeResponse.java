package com.example.practice.practice.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Builder
@Data
public class PracticeResponse {
    int code;
    String message;
    String Data;
}
