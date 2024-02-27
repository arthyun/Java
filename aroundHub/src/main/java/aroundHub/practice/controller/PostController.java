package aroundHub.practice.controller;

import aroundHub.practice.dto.MemberDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {
    @PostMapping("/default")
    public String postMethod(){
        return "Hello Method!";
    }

    @PostMapping("/member1")
    public String postMember(@RequestBody Map<String, Object> postData){
        StringBuilder sb = new StringBuilder();
        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }

    @PostMapping("/member2")
    public MemberDTO postMemberDto(@RequestBody MemberDTO memberDTO){
        return memberDTO;
    }
}
