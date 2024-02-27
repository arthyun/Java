package aroundHub.practice.controller;

import aroundHub.practice.dto.MemberDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Tag(name = "PutController")
@RestController
@RequestMapping("/api/v1/put-api")

public class PutController {
    @PutMapping("/default")
    @Operation(summary = "default", description = "default")
    public String putMethod() {
        return "Hello World";
    }

    @PutMapping("/member1")
    @Operation(summary = "member1", description = "member1")
    public String putMember(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();
        putData.entrySet().forEach(map -> sb.append(map.getKey() + " : " + map.getValue() + "\n"));
        return sb.toString();
    }

    @PutMapping("/member2")
    @Operation(summary = "member2", description = "member2")
    public MemberDTO putMemberDTO1(@RequestBody MemberDTO memberDTO) {
        return memberDTO;
    }

    @PutMapping("/member3")
    @Operation(summary = "member3", description = "member3")
    public String putMemberDTO2(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();
    }

    @PutMapping("/member4")
    @Operation(summary = "ResponseEntity", description = "ResponseEntity")
    public ResponseEntity<MemberDTO> putMemberDTO3(@RequestBody MemberDTO memberDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(memberDTO);
    }
}
