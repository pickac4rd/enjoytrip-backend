package com.board.mapper;

import com.board.vo.Board;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface BoardMapper {
    public List<Board> selectAll();
    public Board selectOne(String board_id);
    public int insert(Board b);
    public int delete(String board_id);
    public int update(Board b);
    public void countUp(String board_id);
    public int likeUp(String board_id);

//    public List<Board> search(String address);
}
