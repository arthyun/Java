package com.springboot.mybatis.main.controller;

import com.springboot.mybatis.main.dto.MainDto;
import com.springboot.mybatis.main.service.MainService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.EOFException;
import java.util.List;

@RestController
public class MainController {
    private final MainService mainService;

    public MainController (MainService mainService){
        this.mainService = mainService;
    }

    @GetMapping("/main")
    public List<MainDto> getUsers () {
        List<MainDto> userList = null;
        try {
            userList = mainService.getUserInfo();
        } catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }
        return userList;
    }
}
