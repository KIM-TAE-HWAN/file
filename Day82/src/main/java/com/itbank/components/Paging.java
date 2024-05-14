package com.itbank.components;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Paging {
	private int reqPage;				// 사용자가 요청한 페이지
	private int totalBoard;				// 총 게시글 수
	private int boardCount = 10;		// 한 페이지에 출력할 게시글 수
	private int totalPage;				// 전체 페이지 수
	private int offset;					// sql에서 게시물을 가져올 시작점
	private int pageCount = 10;			// 한페이지에 출력할 페이지 번호 수
	private int section;				// 페이지 번호 범위를 구분한 index 역할
	private int begin;					// 해당 section에서 첫 페이지 번호
	private int end;					// 해당 section에서 마지막 페이지 번호
	private boolean prev, next;			// 이전, 다음 섹션여부
	
	public Paging(int reqPage, int totalBoard) {
		// 1. 외부로부터 전달 받아야할 데이터(요청페이지, 전체 글수)
		this.reqPage = reqPage;
		this.totalBoard = totalBoard;
		
		// 2. 전체 페이지 수를 구한다
		totalPage = totalBoard / boardCount;
		totalPage += (totalBoard % boardCount == 0) ? 0 : 1;
		
		// 3. 게시글 분할에 필요한 offset를 구한다
		offset = (reqPage - 1) * boardCount;
		
		// 4. 페이지 숫자 범위 나누기
		section = (reqPage - 1) / pageCount;
		begin = section * pageCount + 1;
		end = (section + 1) * pageCount;
		
		end = (end < totalPage) ? end : totalPage;
		
		//5. 이전/다음 section이 있는지 판별
		prev = (section == 0) ? false : true;
		next = (section == totalPage / pageCount) ? false : true;
		// next = end != totalPage;
	}
}
