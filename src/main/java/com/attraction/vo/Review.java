package com.attraction.vo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Review {
    String review_id;
    String content_id;
    String userId;
    String title;
    String content;
    String date;
    String star;
}