package scope;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ScopeServlet
 */
@WebServlet("/scope")
public class ScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		
		//no.jsp에서 넘긴 값 가져오기
		String no = request.getParameter("no");
		
		//DAO의 getUser() 호출 한 후 VO에 담기
		MemberDAO dao = new MemberDAO();
		MemberVO vo = dao.getUser(Integer.parseInt(no));
		
		//vo를 다른 jsp에 넘겨서 출력을 하고 싶다면?
//		HttpSession session = request.getSession();
//		session.setAttribute("vo",vo);
		
		// request로 값을 받으면 forward를 통해서 값을 넘겨주어야 한다.
//		request.setAttribute("vo", vo);
//		response.sendRedirect("scope/result.jsp");
		
		request.setAttribute("vo", vo);
		RequestDispatcher rd = request.getRequestDispatcher("scope/result.jsp");
		rd.forward(request, response);
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
