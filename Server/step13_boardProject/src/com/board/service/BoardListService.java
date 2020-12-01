package com.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.dao.BoardDAO;
import com.board.dto.BoardDTO;
import com.board.dto.BoardPaging;

import controller.CommandAction;

public class BoardListService implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request,
			HttpServletResponse response) throws Throwable {

		int pg = Integer.parseInt(request.getParameter("pg"));

		// select DB
		int pageSize = 5; // 한페이지에 출력할 게시물수
		int endNum = pg * pageSize; // 끝번호
		int startNum = endNum - (pageSize - 1); // 시작번호

		Map<String, Integer> map = new HashMap<>();
		map.put("startNum", startNum);
		map.put("endNum", endNum);

		BoardDAO dao = new BoardDAO();
		List<BoardDTO> list = dao.getBoardList(map);

		// 페이지 처리
		BoardPaging paging = new BoardPaging(pg, 3, pageSize);
		paging.makePagingHTML();

		request.setAttribute("list", list);
		request.setAttribute("pg", pg);
		request.setAttribute("paging", paging);

		return "board/boardList.jsp";
	}

}
