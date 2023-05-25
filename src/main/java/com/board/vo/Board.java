package com.board.vo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {

    private String board_id; // PK
    private String title; // 제목
    private String content; // 내용
    private String date; // 작성 날짜
    private String userId; // 쓴 계정
    private String count; // 조회수
    private String like_count; // 좋아요 수

}
