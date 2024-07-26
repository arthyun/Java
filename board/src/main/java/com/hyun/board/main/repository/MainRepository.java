package com.hyun.board.main.repository;

import com.hyun.board.main.dto.MainResponseDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("MainRepository")
public interface MainRepository {
    List<MainResponseDto> getUsers();
}
