package servlet.compact;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CompactDao;
import dao.impl.CompactDaoImpl;
import model.compact.Compact;
import model.compact.PageCompact;
import model.role.PageRole;
import model.role.Role;
import service.CompactService;
import service.UserService;
import service.impl.CompactServiceImpl;
import service.impl.UserServiceImpl;

/**
 * Servlet implementation class ForwardToCompactServlet
 * @param <E>
 */
@WebServlet("/to/compact")
public class ForwardToCompactServlet<E> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardToCompactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//∑÷“≥’π æ
		CompactService compactService=new CompactServiceImpl();
		int page=1;
		String str=request.getParameter("page");
		
		if (str!=null) {
			page=Integer.parseInt(str);
		}
		PageCompact<Compact> compact=compactService.pageCompact1(page, 4);
		request.setAttribute("pagecompact", compact);
		request.getRequestDispatcher("/WEB-INF/compact/compact.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
