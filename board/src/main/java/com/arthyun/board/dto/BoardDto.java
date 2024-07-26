package com.arthyun.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDto {
    private Long id;
    private int boardHits;
    private String boardTitle;
    private String boardWriter;
    private String boardPass;
    private String boardContents;
    private String createdAt;
}
