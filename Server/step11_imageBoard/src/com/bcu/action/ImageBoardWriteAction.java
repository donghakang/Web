package com.bcu.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcu.dao.ImageBoardDao;
import com.bcu.entity.ImageBoardEntity;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class ImageBoardWriteAction implements CommandProcess{

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		//실제 저장 경로
		String realFolder=request.getServletContext().getRealPath("/storage");
		//System.out.println("저장 폴더:" + realFolder);
		
		//파일업로드
		MultipartRequest multi=new MultipartRequest(
                request, realFolder, 5*1024*1024, "UTF-8",new DefaultFileRenamePolicy());
		
		//데이터 얻어오기
		String imageId=multi.getParameter("imageId");
		String imageName=multi.getParameter("imageName");
		int imagePrice=Integer.parseInt(multi.getParameter("imagePrice"));
		int imageQty=Integer.parseInt(multi.getParameter("imageQty"));
		String imageContent=multi.getParameter("imageContent");
		String imagePath=multi.getFilesystemName("imagepath");
		
		//데이터 저장
		ImageBoardEntity entity=new ImageBoardEntity();
		entity.setImageId(imageId);
		entity.setImageName(imageName);
		entity.setImagePrice(imagePrice);
		entity.setImageQty(imageQty);
		entity.setImageContent(imageContent);
		entity.setImagePath(imagePath);
		
		//DB-insert
		ImageBoardDao dao=ImageBoardDao.getInstance();
		int n=dao.imageBoardInsert(entity);
		
		if(n>0)
			return "imgboard/imageBoardWriteOk.html";
		else
			return "imgboard/imageBoardWrite.html";
	}
}








