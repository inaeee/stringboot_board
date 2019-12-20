package com.example.board.boardsub.mapper;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.board.boardsub.domain.CommentVO;

@Repository("com.example.board.boardsub.mapper.CommentMapper")
public interface CommentMapper {
	
	//댓글 개수
	public int commentCount() throws Exception;
	
	//댓글 목록
	public List<CommentVO> commentList() throws Exception;
	
	//댓글 작성
	public int commentInsert(CommentVO comment) throws Exception;
	
	//댓글 수정
	public int commentUpdate(CommentVO comment) throws Exception;
	
	//댓글 삭제
	public int commentDelete(int cno) throws Exception;

}
