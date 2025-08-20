package com.ashwani.restaurant;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component

public class User {
    int age=18;
    public int getAge() {
        return age;
    }
}
