package controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "Download", urlPatterns = { "/download" })
public class FileDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=getServletContext().getRealPath("/storage");
		
		String filename=request.getParameter("clip");
//		System.out.println("파일명:" + filename);
		
		File file=new File(path + "/" + filename);
//		System.out.println("파일 경로:" + file);
		
		setHeaderTypeEx(response, file);
		transportEx(new FileInputStream(file), response.getOutputStream(), file);
	}
	//파일 속성-------------------------------------------------------------------
	private void setHeaderTypeEx(HttpServletResponse response, File file) 
	                                         throws UnsupportedEncodingException{
		response.setHeader("Content-Disposition", "attachment;filename=" 
	                                                    + toKor(file.getName()));
		response.setHeader("Content-Length", String.valueOf(file.length()));
	}                                         //숫자형 -> 문자형
	
	//파일 전송-------------------------------------------------------------------
	private void transportEx(FileInputStream fileInputStream, 
			  ServletOutputStream outputStream, File file) throws IOException{
		
		BufferedInputStream bin=null;
		BufferedOutputStream bos=null;
		
		try {
			bin=new BufferedInputStream(fileInputStream);
			bos=new BufferedOutputStream(outputStream);
			
			byte[] buf=new byte[(int)file.length()];
			int read=0;
			
			while((read=bin.read(buf)) != -1) {
				bos.write(buf, 0, read);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			bos.close();
			bin.close();
		}
	}
	//한글처리--------------------------------------------------------------------
	public String toKor(String str)throws UnsupportedEncodingException{
		return new String(URLEncoder.encode(str,"UTF-8"));
	}
}
/*  Content-Disposition;attachment 
 *  : 브라우저 인식 파일확장자를 포함하여 모든 확장자의 파일들에 대해 
 *	   다운로드시 무조건 "파일 다운로드" 대화상자가 뜨도록 하는 헤더속성이다
 *
 *  Content-Length
 *   : HttpRequest Header에 포함되어 전달되어야 할때
 *     일정한 길이가 있는 경우 파일을 업로드/다운로드 하는경우
 *     
 *  application/msword로 전송하면  MS-WORD로 인식된다
 *  
 *  application/octet-stream : 8비트로 되어있는 일련의 데이타
 *  표준화된 파일의 형식을 잘 모르는 경우 표시하는 방식
 *  wav --> wav ,  bmp --> bmp로 전송됨
 */












