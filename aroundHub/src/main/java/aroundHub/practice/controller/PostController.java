package aroundHub.practice.controller;

import aroundHub.practice.dto.MemberDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Tag(name = "PostController") // Swagger-ui
@RestController
@RequestMapping("/api/v1/post-api")

public class PostController {
    @PostMapping("/default")
    @Operation(summary = "default", description = "default") // Swagger-ui
    public String postMethod(){
        return "Hello Method!";
    }

    @PostMapping("/member1")
    @Operation(summary = "member1", description = "member1") // Swagger-ui
    public String postMember(@RequestBody Map<String, Object> postData){
        StringBuilder sb = new StringBuilder();
        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }

    @PostMapping("/member2")
    @Operation(summary = "member2", description = "member2") // Swagger-ui
    public MemberDTO postMemberDto(@RequestBody MemberDTO memberDTO){
        return memberDTO;
    }
}
