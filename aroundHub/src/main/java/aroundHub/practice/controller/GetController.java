package aroundHub.practice.controller;


import aroundHub.practice.dto.MemberDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Tag(name = "GetController") // Swagger-ui
@RestController
@RequestMapping("/api/v1/get-api")

public class GetController {
    @Operation(summary = "GetController1", description = "GetController1") // Swagger-ui
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/name")
    public String getName(){
        return "Hyunho";
    }

    @GetMapping("/variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }

    @GetMapping("/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var){
        return var;
    }

    @GetMapping("/request1")
    public String getRequestParam1(@RequestParam String name, @RequestParam String email, @RequestParam String organization){
        return name + " " + email + " " + organization;
    }

    @GetMapping("/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param){
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> sb.append(map.getKey() + " : " + map.getValue() + "\n"));
        return sb.toString();
    }

    @GetMapping("/request3")
    public MemberDTO getRequestParam3(MemberDTO memberDTO){
        return memberDTO;
    }
}
