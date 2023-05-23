package com.attraction.vo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Attraction {

    private String content_id; // PK
    private String content_type_id; // ??

    private String title; // 제목

    private String addr1; // 주소1
    private String addr2; // 주소2

    private String zipcode; // zipcode

    private String tel; // 전화번호

    private String first_image; // 이미지1
    private String first_image2; // 이미지2

    private String readcount;
    private String sido_code;
    private String gugun_code;

    private String latitude;
    private String longitude;
    private String mlevel;
    private String like_count;

}
