package com.board.service;

import com.board.vo.Board;
import com.board.vo.Board;

import java.util.List;

public interface BoardService {
    public List<Board> selectAll();
    public Board selectOne(String num);
    public int insert(Board b);
    public int delete(String num);
    public int update(Board b);

//    public List<Board> search(String address);
}
