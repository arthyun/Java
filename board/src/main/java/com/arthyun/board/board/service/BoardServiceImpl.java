package com.arthyun.board.board.service;

import com.arthyun.board.board.dto.BoardDto;
import com.arthyun.board.board.repository.BoardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;

    public BoardServiceImpl (BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    @Transactional
    public List<BoardDto> getUsers(){
        return boardRepository.getUsers();
    }
}
