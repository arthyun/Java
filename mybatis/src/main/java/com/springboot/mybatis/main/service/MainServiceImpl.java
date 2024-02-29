package com.springboot.mybatis.main.service;

import com.springboot.mybatis.main.dto.MainDto;
import com.springboot.mybatis.main.repository.MainRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {
    private final MainRepository mainRepository;

    public MainServiceImpl (MainRepository mainRepository){
        this.mainRepository = mainRepository;
    }

    @Override
    @Transactional
    public List<MainDto> getUserInfo(){
        return mainRepository.getUserInfo();
    }
}
