package com.example.awstest1;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @RequestMapping(value="/test1")
    public String Test1(){
        return "HeLlo";
    }

    @GetMapping(value="/test2/{par1}")
    public String Test2(@PathVariable String par1){
        return par1;
    }

    @GetMapping(value="/test3")
    public String Test3(
            @RequestParam String a1,
            @RequestParam String a2
    ){
        StringBuilder sb = null;
        sb = new StringBuilder();
        sb.append(a1);
        sb.append(a2);
        String result = sb.toString();
        sb = null;
        return result;
    }

    @GetMapping(value="/test4")
    public String test4(@RequestParam Map<String,String> dto){
        StringBuilder sb = new StringBuilder();
        dto.entrySet().forEach(map -> {
            sb.append(map.getKey() + ":" + map.getValue() + "\n");
        });
        return  sb.toString();
    }
    //entrySet() - key와 value 값 모두 출력





}