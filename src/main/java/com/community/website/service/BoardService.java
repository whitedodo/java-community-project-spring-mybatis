/*
 * 작성일자(Create Date): 2020-10-15
 * 프로젝트명(Project Name): Community Project
 * 저자(Author): Dodo / rabbit.white at daum dot net
 * 파일명(FileName): BoardService.java
 * 비고(Description):
 * 
 */

package com.community.website.service;

import java.util.List;

import com.community.website.vo.BoardMultiVO;
import com.community.website.vo.BoardVO;
import com.community.website.vo.FileMultiVO;
import com.community.website.vo.FileVO;

public interface BoardService {

	public BoardVO select(String boardname, long id);
	public List<BoardVO> selectAll();
	
	public long selectTotalCount(String boardname);
	public List<BoardVO> selectPagingAll(String boardname, 
										long start, long end);
	
	public BoardVO selectBoard(BoardMultiVO vo);
	
	public void insertSample(String boardname);
	
	public void insertBoard(BoardMultiVO vo);
	public void insertFileVOBoard(FileMultiVO vo);
	
	public List<FileVO> selectFileVOBoard(FileMultiVO vo);
	public FileVO selectFileVOInfo(FileMultiVO vo);
}
