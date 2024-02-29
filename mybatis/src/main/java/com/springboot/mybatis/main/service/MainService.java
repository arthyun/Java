package com.springboot.mybatis.main.service;

import com.springboot.mybatis.main.dto.MainDto;

import java.util.List;

public interface MainService {
    List<MainDto> getUserInfo();
}
