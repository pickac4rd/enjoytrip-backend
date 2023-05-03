package com.attraction.service;

import com.attraction.vo.Attraction;
import com.attraction.vo.Review;

import java.util.List;

public interface AttractionService {
    List<Attraction> selectAll();
    Attraction selectOne(String num);
    List<Attraction> search(Attraction attraction);

    void insertReview(Review review);

//    public int insert(Attraction c);
//    public int delete(String num);
//    public int update(Attraction c);

//    public List<Attraction> search(String address);
}
