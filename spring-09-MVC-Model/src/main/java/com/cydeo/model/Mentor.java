package com.cydeo.model;

import com.cydeo.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {

    private String firstName, lastName;
    private int age;
    private Gender gender;
}
