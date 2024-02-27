package aroundHub.practice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "HelloController") // Swagger-ui
@RestController

public class HelloController {
    // 구식
    // @RequestMapping(value = "/hello", method = RequestMethod.GET)
    // 신식
    @Operation(summary = "HelloController1", description = "HelloController2") // Swagger-ui
    @GetMapping("hello")
    public String hello(){
        return "Hello World!";
    }
}
