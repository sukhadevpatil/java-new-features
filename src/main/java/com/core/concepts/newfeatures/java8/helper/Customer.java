package com.core.concepts.newfeatures.java8.helper;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Long id;

    private String name;

    private String email;

    private List<String> phoneNumbers;
}
