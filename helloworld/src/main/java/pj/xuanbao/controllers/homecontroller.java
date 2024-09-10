package pj.xuanbao.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns = {"/home","/trangchu"})

public class homecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String ten1 = req.getParameter("ten");
		String ho1 = req.getParameter("ho");
		
		//dua du lieu ra view
		req.setAttribute("fname", ten1);
		req.setAttribute("lname", ho1);
		
//		PrintWriter printW = resp.getWriter();
//		printW.println(ho1 + " " + ten1);
//		printW.close();
		RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
		rd.forward(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
