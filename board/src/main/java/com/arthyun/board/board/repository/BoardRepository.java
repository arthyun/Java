package com.arthyun.board.board.repository;

import com.arthyun.board.board.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("BoardRepository")
public interface BoardRepository {
    List<BoardDto> getUsers();
}
