package kr.co.kh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
		//넘겨줘야 내가 달라고도 할 수 있고 브라우저에 뿌려줄 때도 가져올 수도 있기에 request,response 세트임.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("동작하니");
		String name =request.getParameter("username");
		String address = request.getParameter("address");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		String email = request.getParameter("email");
		out.print("이름 : "+name+"<br>");
		out.print("주소 : "+address+"<br>");
		out.print("아이디 : "+userid+"<br>");
		out.print("비밀번호 : "+passwd+"<br>");
		out.print("이메일 : "+email+"<br>");
	}

}
