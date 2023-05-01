package com.attraction.mapper;

import com.attraction.vo.Attraction;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AttractionMapper {
    public List<Attraction> selectAll();
    public Attraction selectOne(String num);
//    public int insert(Attraction c);
//    public int delete(String num);
//    public int update(Attraction c);

//    public List<Attraction> search(String address);
}
