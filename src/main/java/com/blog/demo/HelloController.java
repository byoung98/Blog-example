package com.blog.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/homePage")
    public String helloWorld(){
        return "Hello World"; 
    }


@GetMapping("/newInfo")
public List<String> feedMeInfo(){
   List<String> feedMeInfo = new ArrayList<>();
    feedMeInfo.add("testInfo1");
    feedMeInfo.add("testnifo2");
   return feedMeInfo;
    }
}
