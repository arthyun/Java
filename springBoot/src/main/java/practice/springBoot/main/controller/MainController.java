package practice.springBoot.main.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practice.springBoot.main.dto.MainResDto;
import practice.springBoot.main.service.MainService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@Tag(name = "MainController")
public class MainController {

    private final MainService mainService;

    public MainController (MainService mainService){
        this.mainService = mainService;
    }

    @GetMapping("/getUsers")
    @Operation(summary = "유저정보 조회", description = "테스트")
    public List<MainResDto> getUsers () {
        return mainService.getUser();
    }

}
