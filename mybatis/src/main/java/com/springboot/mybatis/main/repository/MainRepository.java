package com.springboot.mybatis.main.repository;

import com.springboot.mybatis.main.dto.MainDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("MainRepository")
public interface MainRepository {
    List<MainDto> getUserInfo();
}
