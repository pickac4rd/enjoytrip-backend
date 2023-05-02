package com.board.service;

import com.board.vo.Board;
import com.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardMapper mapper;
    @Override
    public List<Board> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public Board selectOne(String num) {
        return mapper.selectOne(num);
    }

    @Override
    public int insert(Board b) {
        return mapper.insert(b);
    }

    @Override
    public int delete(String num) {
        return mapper.delete(num);
    }

    @Override
    public int update(Board c) {
        return mapper.update(c);
    }

//    @Override
//    public List<Board> search(String address) {
//        return search();
//    }
}
