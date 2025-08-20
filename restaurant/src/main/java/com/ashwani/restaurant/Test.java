package com.ashwani.restaurant;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Test {
    private  final User user;
    @GetMapping("/hi")
    public void hello(){
        System.out.println(user.getAge());
    }
}
