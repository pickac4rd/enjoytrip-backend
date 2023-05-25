package com.attraction.service;

import com.attraction.vo.Attraction;
import com.attraction.vo.Gugun;
import com.attraction.vo.Review;
import com.attraction.vo.Sido;

import java.util.List;

public interface AttractionService {
    List<Attraction> selectAll();
    Attraction selectOne(String num);
    List<Attraction> search(Attraction attraction);

    int insertReview(Review review);

    int deleteReview(String reviewId);

    List<Sido> selectSidoList();

    List<Gugun> selectGugunList(String sidoCode);

    List<Attraction> selectPartial(String offset, String limit);

    List<Attraction> selectPartialSearch(String offset, String limit, String sido_code, String gugun_code, String content_type_id, String text);

    Integer getAttractionLength();

    Integer getSearchedAttractionLength(String sido_code, String gugun_code, String content_type_id, String text);

//    public int insert(Attraction c);
//    public int delete(String num);
//    public int update(Attraction c);

}
