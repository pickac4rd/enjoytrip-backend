package com.attraction.mapper;

import com.attraction.vo.Attraction;
import com.attraction.vo.Gugun;
import com.attraction.vo.Review;
import com.attraction.vo.Sido;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AttractionMapper {
    List<Attraction> selectAll();
    Attraction selectOne(String num);

    List<Attraction> search(Attraction attraction);

    int insertReview(Review review);

    int deleteReview(String review_id);
//    public int insert(Attraction c);
//    public int delete(String num);
    int update(Attraction c);

    List<Sido> selectSidoList();

    List<Gugun> selectGugunList(String sidoCode);

    List<Attraction> selectPartial(Map<String, String> paramMap);

    Integer getAttractionLength();

    List<Attraction> selectPartialSearch(Map<String,String> paramMap);

    Integer getSearchedAttractionLength(Map<String,String> paramMap);
}
