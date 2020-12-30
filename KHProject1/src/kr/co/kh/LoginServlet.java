package kr.co.kh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")//액션의 이름
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");//jsp에서는 자동으로 만들어주지만 서블릿에서는 안 만들어지기에 우리가 만들어줘야 한다.
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		out.print("아이디 : "+id+"<br>");
		out.print("패스워드 : "+passwd+"<br>");
	}

}
