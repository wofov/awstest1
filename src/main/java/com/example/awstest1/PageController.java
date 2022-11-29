package com.example.awstest1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {

        @GetMapping("/test")
        public String test(){
            return "test";
        }

    @GetMapping("/test2")
    public String test2(){
        return "test2";
    }


}
