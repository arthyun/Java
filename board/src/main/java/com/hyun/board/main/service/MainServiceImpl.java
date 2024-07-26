package com.hyun.board.main.service;

import com.hyun.board.main.dto.MainResponseDto;
import com.hyun.board.main.repository.MainRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {
    private final MainRepository mainRepository;

    public MainServiceImpl(MainRepository mainRepository){
        this.mainRepository = mainRepository;
    }

    @Override
    @Transactional
    public List<MainResponseDto> getUsers(){
        return mainRepository.getUsers();
    }
}
