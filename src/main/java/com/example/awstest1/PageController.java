package com.example.awstest1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PageController {

        @GetMapping("/test")
        public String test(){
            return "test";
        }
}