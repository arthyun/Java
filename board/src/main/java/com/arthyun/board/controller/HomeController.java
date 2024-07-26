package com.arthyun.board.controller;

import com.arthyun.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        System.out.println("HomeController.index");
        return "index";
    }
}
