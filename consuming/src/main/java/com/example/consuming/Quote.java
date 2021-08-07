package com.example.consuming;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties
@Data
public class Quote {
    private String type;
    private Value value;


}
