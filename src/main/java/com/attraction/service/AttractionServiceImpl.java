package com.attraction.service;

import com.attraction.vo.Attraction;
import com.attraction.mapper.AttractionMapper;
import com.attraction.vo.Gugun;
import com.attraction.vo.Review;
import com.attraction.vo.Sido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public int insertReview(Review review) {
        return mapper.insertReview(review);
    }

    @Override
    public int deleteReview(String review_id) {
        return mapper.deleteReview(review_id);
    }

    @Override
    public List<Sido> selectSidoList() {
        return mapper.selectSidoList();
    }

    @Override
    public List<Gugun> selectGugunList(String sidoCode) {
        return mapper.selectGugunList(sidoCode);
    }

    @Override
    public List<Attraction> selectPartial(String offset, String limit) {
        Map<String,String> paramMap = new HashMap<>();
        paramMap.put("offset", offset);
        paramMap.put("limit",limit);
        return mapper.selectPartial(paramMap);
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
}
