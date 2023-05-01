package com.attraction.vo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    public Attraction(String content_type_id, String title, String addr1, String addr2, String zipcode, String tel, String first_image, String first_image2, String readcount, String sido_code, String gugun_code, String latitude, String longitude, String mlevel) {
        this.content_type_id = content_type_id;
        this.title = title;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.zipcode = zipcode;
        this.tel = tel;
        this.first_image = first_image;
        this.first_image2 = first_image2;
        this.readcount = readcount;
        this.sido_code = sido_code;
        this.gugun_code = gugun_code;
        this.latitude = latitude;
        this.longitude = longitude;
        this.mlevel = mlevel;
    }
}
