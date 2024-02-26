package aroundHub.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // 구식
    // @RequestMapping(value = "/hello", method = RequestMethod.GET)
    // 신식
    @GetMapping("hello")
    public String hello(){
        return "Hello World!";
    }
}
