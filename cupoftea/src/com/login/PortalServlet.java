package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PortalServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession();
		String sessionValidateCode=(String) session.getAttribute("sessionValidateCode");
		
		String username= req.getParameter("username");
		String password=req.getParameter("password");
		String usrValidateCode=req.getParameter("validateCode");
		
		PrintWriter print = resp.getWriter();
		if(usrValidateCode.equals(sessionValidateCode)){
			System.out.println("just so so !"+ username);
		}else{
			print.println("<span style='color:red'>你妹啊，日</span>");
			print.println("session中的验证码："+sessionValidateCode+"用户输入验证码："+usrValidateCode);
		}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
