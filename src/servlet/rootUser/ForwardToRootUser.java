package servlet.rootUser;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.user.RootUser;
import model.user.RootUserPageInfo;
import service.UserService;
import service.impl.UserServiceImpl;

/**
 * Servlet implementation class ForwardToRootUser
 * 
 * @param <E>
 */
@WebServlet("/to/rootuser")
public class ForwardToRootUser<E> extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ForwardToRootUser() {
		super();
		// TODO Auto-generated constructor stub

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// 在这里要分页显示管理员用户信息
		request.setCharacterEncoding("utf-8");
		UserService<E> userService = new UserServiceImpl();
		int page = 1;
		String str = request.getParameter("page");
		if (str != null) {
			page = Integer.parseInt(str);
		}

		RootUserPageInfo<RootUser> list = userService.pageForRootUser(page, 4);
		request.setAttribute("rootuser", list);

		request.getRequestDispatcher("/WEB-INF/user/rootuser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
