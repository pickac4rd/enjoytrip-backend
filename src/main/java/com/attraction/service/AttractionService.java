package com.attraction.service;

import com.attraction.vo.Attraction;

import java.util.List;

public interface AttractionService {
    public List<Attraction> selectAll();
    public Attraction selectOne(String num);
//    public int insert(Attraction c);
//    public int delete(String num);
//    public int update(Attraction c);

//    public List<Attraction> search(String address);
}
