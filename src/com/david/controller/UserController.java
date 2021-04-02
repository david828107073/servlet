package com.david.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.david.service.UserService;
import com.david.service.UserServiceImpl;
import com.google.gson.Gson;

@WebServlet(name = "app", urlPatterns = { "/app" })
public class UserController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
//		res.setHeader("Access-Control-Allow-Origin", "*");
		PrintWriter out = res.getWriter();
		Gson gson = new Gson();
		out.print(gson.toJson(userService.findAll()));
	}
}
