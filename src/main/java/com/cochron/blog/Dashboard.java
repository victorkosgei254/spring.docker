package com.cochron.blog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

public class Dashboard{

   
    public String helloUser(){
        return "Hi User...OK!!";
    }
}