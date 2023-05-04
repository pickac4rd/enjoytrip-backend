package com.attraction.service;

import com.attraction.vo.Attraction;
import com.attraction.vo.Review;

import java.util.List;

public interface AttractionService {
    List<Attraction> selectAll();
    Attraction selectOne(String num);
    List<Attraction> search(Attraction attraction);

    int insertReview(Review review);

    int deleteReview(String reviewId);

//    public int insert(Attraction c);
//    public int delete(String num);
//    public int update(Attraction c);

//    public List<Attraction> search(String address);
}
