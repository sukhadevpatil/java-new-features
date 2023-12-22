package com.core.concepts.newfeatures.json.gson;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Data
public class Staff {
    private String name;
    private int age;
    private String[] position;              // array
    private List<String> skills;            // list
    private Map<String, BigDecimal> salary; // map
}
