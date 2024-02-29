package practice.springBoot.main.service;

import org.springframework.stereotype.Service;
import practice.springBoot.main.dto.MainResDto;
import practice.springBoot.main.repository.MainRepository;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {

    private final MainRepository mainRepository;

    public MainServiceImpl(MainRepository mainRepository){
        this.mainRepository = mainRepository;
    }

    @Override
    public List<MainResDto> getUser(){
        return mainRepository.getUserInfo();
    }
}
