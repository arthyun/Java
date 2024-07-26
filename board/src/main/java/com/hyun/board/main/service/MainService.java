package com.hyun.board.main.service;

import com.hyun.board.main.dto.MainResponseDto;

import java.util.List;

public interface MainService {
    List<MainResponseDto> getUsers();
}
