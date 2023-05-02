package com.board.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    private String board_id; // PK
    private String title; // 제목
    private String content; // 내용
    private String date; // 작성 날짜
    private String userid; // 쓴 계정
    private String count; // 조회수
    private String like_count; // 좋아요 수

}
