package com.board.controller;

import com.board.service.BoardService;
import com.board.vo.Board;
//import com.member.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BoardController {
    @Autowired
    BoardService service;
    @GetMapping(value =  "/board" )
    public ResponseEntity<List<Board>> selectAll()throws Exception {// Map(key, value)


        return ResponseEntity.status(HttpStatus.OK).body(service.selectAll());

    }
    @GetMapping(value = "/board/{content_id}")
    public ResponseEntity<Board> read(@PathVariable String content_id)throws Exception  {

        return ResponseEntity.status(HttpStatus.OK).body(service.selectOne(content_id));
    }

    @PostMapping(value = "/board") // db에 입력
    public ResponseEntity<String> insertProcess(@RequestBody Board b, HttpSession session) throws Exception {// vo. 사용자가 입력한 값 4개를 받아옴.입력화면의 칸이름과 vo의 필드명이 일치해야 함.
//        Member member=(Member) session.getAttribute("member");
//        b.setUserid(member.getUserId());
        service.insert(b);
        ResponseEntity<String> rb =
                new ResponseEntity<String>("insert success!",HttpStatus.OK);
        return rb;// redirect
    }

    @PutMapping(value = "/board")
    public ResponseEntity<String> modify(@RequestBody Board b)throws Exception  {
        service.update(b);
        ResponseEntity<String> rb =
                new ResponseEntity<String>("modify success!", HttpStatus.OK);
        return rb;// view name
    }


    @PutMapping(value = "/board/{board_id}/like")
    public ResponseEntity<String> likeUp(@PathVariable String board_id)throws Exception  {

        service.likeUp(board_id);
        ResponseEntity<String> rb =
                new ResponseEntity<String>("like success!", HttpStatus.OK);
        return rb;// view name
    }
    @DeleteMapping(value = "/board/{num}")
    public ResponseEntity<String> delete(@PathVariable String num)throws Exception  {
        int x = service.delete(num);
        ResponseEntity<String> rb = null;
        if (x>=1) {
            rb = new ResponseEntity<>("delete success!",HttpStatus.OK);
        }
        else{
            rb = new ResponseEntity<>( "delete fail!",HttpStatus.BAD_REQUEST);
        }
        return rb;// view name
    }
//
//    @GetMapping(value = "/board/find/{address}")
//    @ApiOperation(notes = "address에 해당하는 전체 Board 객체 리스트를 조회 합니다.", value = "Board address 검색")
//    public ResponseEntity<List<Board>> search(@PathVariable String address)throws Exception  {
//        List<Board> list = service.search(address);
//        return ResponseEntity.status(HttpStatus.OK).body(list);
//    }
}


