package com.example.board.boardsub.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.board.boardsub.domain.BoardVO;
import com.example.board.boardsub.domain.FileVO;

@Repository("com.example.board.boardsub.mapper.BoardMapper")
//@Repository: 해당 클래스가 데이터베이스에 접근하는 클래임을 명시 
public interface BoardMapper {
	
	//개시글 개수
	public int boardCount() throws Exception;

	//개시글 목록
	public List<BoardVO> boardList() throws Exception;
	
	//게시글 상세
	public BoardVO boardDetail(int bno) throws Exception;
	
	//게시글 작성
	public int boardInsert(BoardVO board) throws Exception;
	
	//게시글 수정
	public int boardUpdate(BoardVO board) throws Exception;
	
	//게시글 삭제
	public int boardDelete(int bno) throws Exception;
	
	public int fileInsert(FileVO file) throws Exception;
	
	//파일 상세
	public FileVO fileDetail(int bno) throws Exception;
	
}
