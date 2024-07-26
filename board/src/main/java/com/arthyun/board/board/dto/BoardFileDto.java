package com.arthyun.board.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigInteger;

@Getter
@Setter
@ToString
public class BoardFileDto {
    private BigInteger fileSize;
}
