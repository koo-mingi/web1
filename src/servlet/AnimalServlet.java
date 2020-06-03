package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnimalServlet
 */
@WebServlet("/animal")
public class AnimalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//가져오는 데이터 한글 인코딩 설정
		request.setCharacterEncoding("utf-8");
		
		//보여주는 페이지 컨텐트타입 설정
		response.setContentType("text/html; charset=UTF-8");
		
		//데이터 가져오기
		//String animal=request.getParameter("animal"); // 하나만 가져올 수 있음.
		String[] animal=request.getParameterValues("animal");
		
		//가져온 데이터 출력하기
		PrintWriter out = response.getWriter();
		//out.print("<h2>선택한 동물은 "+animal+"입니다.</h2>");
		for(String s:animal) {
			out.print("<h2>선택한 동물은 "+s+"입니다.</h2>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
