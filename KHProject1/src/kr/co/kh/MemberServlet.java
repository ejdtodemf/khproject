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
		//�Ѱ���� ���� �޶�� �� �� �ְ� �������� �ѷ��� ���� ������ ���� �ֱ⿡ request,response ��Ʈ��.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("�����ϴ�");
		String name =request.getParameter("username");
		String address = request.getParameter("address");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		String email = request.getParameter("email");
		out.print("�̸� : "+name+"<br>");
		out.print("�ּ� : "+address+"<br>");
		out.print("���̵� : "+userid+"<br>");
		out.print("��й�ȣ : "+passwd+"<br>");
		out.print("�̸��� : "+email+"<br>");
	}

}
