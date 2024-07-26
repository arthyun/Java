package com.hyun.board.main.controller;

import com.hyun.board.main.dto.MainResponseDto;
import com.hyun.board.main.service.MainService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@Tag(name = "Main Controller")
public class MainController {
    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/users")
    @Operation(summary = "유저정보 조회", description = "전체 유저 정보임, 비번 암호화 해제")
    public List<MainResponseDto> getUsers() {
        return mainService.getUsers();
    }
}
