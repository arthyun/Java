package com.hyun.board.main.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Schema(title ="유저정보 조회")
public class MainResponseDto {
    private Integer id;
    private String userName;
    private String passWord;
    private String email;
    private String nickName;
}
