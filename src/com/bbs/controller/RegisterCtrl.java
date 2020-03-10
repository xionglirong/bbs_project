package com.bbs.controller;

import java.io.IOException;
import java.nio.file.attribute.UserPrincipalLookupService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbs.service.UserService;
import com.mysql.jdbc.StringUtils;

@WebServlet("/register")
public class RegisterCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String userId = request.getParameter("userId");//账户
		String userPsw = request.getParameter("userPsw");//密码
		String rePassword = request.getParameter("rePassword");//确认密码
		String userAlice = request.getParameter("userAlice");//昵称
		String userEmail = request.getParameter("userEmail");//邮箱
		String userSex = request.getParameter("userSex");//性别
		if(StringUtils.isNullOrEmpty(userId) || StringUtils.isNullOrEmpty(userPsw) || StringUtils.isNullOrEmpty(rePassword)
				|| StringUtils.isNullOrEmpty(userAlice) || StringUtils.isNullOrEmpty(userEmail) 
				|| StringUtils.isNullOrEmpty(userSex)) {
				request.setAttribute("error", "任何信息都不能为空");
				request.getRequestDispatcher("register.jsp").forward(request, response);
				return;
		}
		if(userPsw.equals(rePassword) == false) {
			request.setAttribute("error", "密码和确认密码必须相同");
			request.getRequestDispatcher("register.jsp").forward(request, response);
			return;
		}
		//if(userService.fi)
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
