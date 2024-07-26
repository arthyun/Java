package com.arthyun.board.board.controller;

import com.arthyun.board.board.dto.BoardDto;
import com.arthyun.board.board.repository.BoardRepository;
import com.arthyun.board.board.service.BoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {
    // 서비스 의존성 부여1
    private final BoardService boardService;
    private final BoardRepository boardRepository;

    // 서비스 의존성 부여2
    public BoardController (BoardService boardService, BoardRepository boardRepository){
        this.boardService = boardService;
        this.boardRepository = boardRepository;
    }

    //    @GetMapping("/save")
    //    public String save() {
    //        return "save";
    //    }
    //
    //    @PostMapping("/save")
    //    public String save(BoardDto boardDto) {
    //        System.out.println("boardDto => " + boardDto);
    //        return "index";
    //    }

    @GetMapping("/test")
    public List<BoardDto> getUsers () {
        List<BoardDto> userList = null;
        try {
            userList = boardService.getUsers();
        } catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }
        return userList;
    }
}
