package com.board.mapper;

import com.board.vo.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public List<Board> selectAll();
    public Board selectOne(String num);
    public int insert(Board b);
    public int delete(String num);
    public int update(Board b);

//    public List<Board> search(String address);
}
