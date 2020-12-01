package com.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.dao.BoardDAO;
import com.board.dto.BoardDTO;

import controller.CommandAction;

public class BoardModifyService implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request,
			HttpServletResponse response) throws Throwable {
		// 상세 보기
		int seq = Integer.parseInt(request.getParameter("seq")); // 글번호
		int pg = Integer.parseInt(request.getParameter("pg")); // 되돌아갈 페이지

		// select DB
		BoardDAO boardDao = new BoardDAO();
		BoardDTO dto = boardDao.getBoard(seq); // 글 번호에 해당하는 글 가져오기
		request.setAttribute("dto", dto);
		request.setAttribute("pg", pg);
		request.setAttribute("seq", seq);

		return "board/boardModify.jsp";
	}

}
