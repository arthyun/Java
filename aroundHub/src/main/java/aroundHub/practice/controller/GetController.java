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
    @GetMapping("/hello")
    @Operation(summary = "hello", description = "hello") // Swagger-ui
    public String getHello(){
        return "Hello World";
    }

    @GetMapping("/name")
    @Operation(summary = "name", description = "name") // Swagger-ui
    public String getName(){
        return "Hyunho";
    }

    @GetMapping("/variable1/{variable}")
    @Operation(summary = "variable1", description = "variable1") // Swagger-ui
    public String getVariable1(@PathVariable String variable){
        return variable;
    }

    @GetMapping("/variable2/{variable}")
    @Operation(summary = "variable2", description = "variable2") // Swagger-ui
    public String getVariable2(@PathVariable("variable") String var){
        return var;
    }

    @GetMapping("/request1")
    @Operation(summary = "request1", description = "request1") // Swagger-ui
    public String getRequestParam1(@RequestParam String name, @RequestParam String email, @RequestParam String organization){
        return name + " " + email + " " + organization;
    }

    @GetMapping("/request2")
    @Operation(summary = "request2", description = "request2") // Swagger-ui
    public String getRequestParam2(@RequestParam Map<String, String> param){
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> sb.append(map.getKey() + " : " + map.getValue() + "\n"));
        return sb.toString();
    }

    @GetMapping("/request3")
    @Operation(summary = "request3", description = "request3") // Swagger-ui
    public MemberDTO getRequestParam3(MemberDTO memberDTO){
        return memberDTO;
    }
}
