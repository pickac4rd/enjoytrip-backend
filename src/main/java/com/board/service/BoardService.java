package com.board.service;


import java.util.List;

import com.board.vo.Board;
import com.board.vo.BoardParameterDto;
import com.util.PageNavigation;
import com.board.vo.Board;
import com.board.vo.BoardParameterDto;

public interface BoardService {
	public boolean writeArticle(Board boardDto) throws Exception;
	public List<Board> listArticle(BoardParameterDto boardParameterDto) throws Exception;
	public PageNavigation makePageNavigation(BoardParameterDto boardParameterDto) throws Exception;

	public Board getArticle(int articleno) throws Exception;
	public void updateHit(int articleno) throws Exception;
	public boolean modifyArticle(Board boardDto) throws Exception;
	public boolean deleteArticle(int articleno) throws Exception;
}
