package com.example.consuming;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Value {
    private Long Id;
    private String quote;
}
