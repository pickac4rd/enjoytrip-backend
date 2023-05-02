package com.board.service;

import com.board.vo.Board;
import com.board.vo.Board;

import java.sql.SQLException;
import java.util.List;

public interface BoardService {
    public List<Board> selectAll();
    public Board selectOne(String board_id);
    public int insert(Board b);
    public int delete(String board_id);
    public int update(Board b);

    public int likeUp(String board_id);
//    public List<Board> search(String address);
}
