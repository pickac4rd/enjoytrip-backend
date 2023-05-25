package com.attraction.controller;

import com.attraction.vo.Attraction;
import com.attraction.service.AttractionService;
import com.attraction.vo.Gugun;
import com.attraction.vo.Review;
import com.attraction.vo.Sido;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin("*")
@RestController
@Slf4j
public class AttractionController {
    @Autowired
    AttractionService service;
    @GetMapping(value =  "/attractions" )
    public ResponseEntity<List<Attraction>> selectAll()throws Exception {// Map(key, value)
        List<Attraction> list = service.selectAll();
        System.out.println("selectAll");
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
    @GetMapping(value = "/attractions/{content_id}")
    public ResponseEntity<Attraction> read(@PathVariable String content_id)throws Exception  {

        return ResponseEntity.status(HttpStatus.OK).body(service.selectOne(content_id));
    }

    @GetMapping(value = "/attractions/search") // db에 입력
    public ResponseEntity<List<Attraction>> search(@ModelAttribute Attraction attraction) throws Exception {// vo. 사용자가 입력한 값 4개를 받아옴.입력화면의 칸이름과 vo의 필드명이 일치해야 함.
        System.out.println(attraction.toString());
        return ResponseEntity.status(HttpStatus.OK).body(service.search(attraction));// redirect
    }

    @PostMapping(value = "/attractions/{content_id}")
    public ResponseEntity<String> insertReview(@RequestBody Review review){
        int x = service.insertReview(review);
        if(x==1){
            return ResponseEntity.status(HttpStatus.OK).body("Insert Successfully");
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Insert Failed");
        }
    }

    @DeleteMapping(value = "/attractions/{content_id}/{review_id}")
    public ResponseEntity<String> deleteReview(@PathVariable String review_id){
        int x = service.deleteReview(review_id);
        if(x==1){
            return ResponseEntity.status(HttpStatus.OK).body("Delete Successfully");
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Delete Failed");
        }
    }

    @GetMapping(value = "/attractions/sido")
    public ResponseEntity<List<Sido>> selectSidoList(){
        System.out.println("selectSido");
        List<Sido> list = service.selectSidoList();
        return ResponseEntity.status(HttpStatus.OK).body(list);

    }

    @GetMapping(value = "/attractions/sido/{sido_code}")
    public ResponseEntity<List<Gugun>> selectGugunList(@PathVariable String sido_code){
        List<Gugun> list = service.selectGugunList(sido_code);
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

//    @GetMapping(value = "/attractions/partial")
//    public ResponseEntity<List<Attraction>> selectPartial(String offset, String limit){
//        List<Attraction> list = service.selectPartial(offset, limit);
//        System.out.println("offset = " + offset);
//        System.out.println("limit = " + limit);
//        return ResponseEntity.status(HttpStatus.OK).body(list);
//    }

    @GetMapping(value = "/attractions/partial/search")
    public ResponseEntity<List<Attraction>> selectPartial(String offset, String limit,String sido_code,String gugun_code,String content_type_id, String title){

        if(sido_code != null && sido_code.equals("undefined")){
            sido_code = null;
        }
        if(gugun_code != null && gugun_code.equals("undefined")){
            gugun_code = null;
        }
        if(content_type_id != null && content_type_id.equals("undefined")){
            content_type_id = null;
        }
        if(title != null && title.equals("undefined")){
            title = null;
        }
        List<Attraction> list = service.selectPartialSearch(offset, limit,sido_code,gugun_code,content_type_id,title);

        System.out.println("offset = " + offset);
        System.out.println("sido_code = " + sido_code);
        System.out.println("gugun_code = " + gugun_code);
        System.out.println("content_type_id = " + content_type_id);
        System.out.println("title = " + title);
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping(value = "/attractions/partial/length")
    public ResponseEntity<Integer> getAttractionLength(){
        Integer count = service.getAttractionLength();
        return ResponseEntity.status(HttpStatus.OK).body(count);
    }

    @GetMapping(value = "/attractions/partial/search-length")
    public ResponseEntity<Integer> getSearchedAttractionLength(String sido_code,String gugun_code,String content_type_id, String text){
        Integer count = service.getSearchedAttractionLength(sido_code,gugun_code,content_type_id,text);
        return ResponseEntity.status(HttpStatus.OK).body(count);
    }
//    @PostMapping(value = "/customers/aa") // db에 입력
//    @ApiOperation(notes = "객체를 삽입 합니다.", value = "Attraction 객체 삽입")
//    public Map<String, String> insertProcess2(@RequestBody Car c) throws Exception {// vo. 사용자가 입력한 값 4개를 받아옴.입력화면의 칸이름과 vo의 필드명이 일치해야 함.
//        Map<String, String> map = new HashMap<>();
//        map.put("result", "insert success!");
//        return map;// redirect
//    }
//
//    @PutMapping(value = "/customers")
//    @ApiOperation(notes = "해당 Attraction 객체를 수정 합니다.", value = "Attraction 객체 수정")
//    public ResponseEntity<String> modify(@RequestBody Attraction b)throws Exception  {
//        service.update(b);
//        ResponseEntity<String> rb =
//                new ResponseEntity<String>("modify success!", HttpStatus.OK);
//        return rb;// view name
//    }
//    @DeleteMapping(value = "/customers/{num}")
//    @ApiOperation(notes = "num에 해당하는 전체 Attraction 객체를 삭제 합니다.", value = "Attraction 객체 삭제")
//    public Map<String, String> delete(@PathVariable String num)throws Exception  {
//        int x = service.delete(num);
//        Map<String, String> map = new HashMap<>();
//        if (x>=1) {
//            map.put("result", "delete success!");
//        }
//        else{
//            map.put("result", "delete fail!");
//        }
//        return map;// view name
//    }
//
//    @GetMapping(value = "/customers/find/{address}")
//    @ApiOperation(notes = "address에 해당하는 전체 Attraction 객체 리스트를 조회 합니다.", value = "Attraction address 검색")
//    public ResponseEntity<List<Attraction>> search(@PathVariable String address)throws Exception  {
//        List<Attraction> list = service.search(address);
//        return ResponseEntity.status(HttpStatus.OK).body(list);
//    }
}


