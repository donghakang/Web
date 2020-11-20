package com.bcu.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcu.action.CommandProcess;

@SuppressWarnings("serial")
public class ControlServlet extends HttpServlet{
	@SuppressWarnings("rawtypes")
	Map map = new HashMap();
		
	public void init(){}
	public void init(ServletConfig config){
		String  property=config.getServletContext().getRealPath("/WEB-INF/commandPro.properties");
//		System.out.println("property="+property);
		
		FileInputStream fin=null;
		Properties properties = new Properties();
		
		try {
			fin = new FileInputStream(property);
			properties.load(fin);
//			System.out.println("properties="+properties);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Iterator it = properties.keySet().iterator();
		while(it.hasNext()){
			String key = (String)it.next();
//			System.out.println("key="+key);
			
			String className = properties.getProperty(key);
//			System.out.println("className="+className);
			
			try {
				Class classType = Class.forName(className);
				Object ob = classType.newInstance();
				
				map.put(key, ob);//맵에 저장
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}//while
	}//init()
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		execute(request,response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		execute(request,response);
	}

	public void execute(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
//		System.out.println("\n-------------------");
		
		//한글처리
		if(request.getMethod().equals("POST")){
			request.setCharacterEncoding("UTF-8");
		}
		
		//요청
		String category = request.getServletPath();
//		System.out.println("category = " + category);
		
		CommandProcess command = (CommandProcess) map.get(category);
//		System.out.println("command = " + command);
		
		String view=null;
		try {
			view = command.requestPro(request, response);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		//응답
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);//상대번지
		dispatcher.forward(request, response);//제어권넘기기
	}	
	
}










