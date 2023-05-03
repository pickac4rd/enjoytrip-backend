package com.attraction.service;

import com.attraction.vo.Attraction;
import com.attraction.mapper.AttractionMapper;
import com.attraction.vo.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttractionServiceImpl implements AttractionService{

    @Autowired
    AttractionMapper mapper;
    @Override
    public List<Attraction> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public Attraction selectOne(String num) {
        return mapper.selectOne(num);
    }

    @Override
    public List<Attraction> search(Attraction attraction) {

        return mapper.search(attraction);
    }

    @Override
    public void insertReview(Review review) {
        mapper.insertReview(review);
    }

//    @Override
//    public int insert(Attraction c) {
//        return 0;
//    }
//
//    @Override
//    public int delete(String num) {
//        return 0;
//    }
//
//    @Override
//    public int update(Attraction c) {
//        return 0;
//    }
//
//    @Override
//    public List<Attraction> search(String address) {
//        return null;
//    }
}
