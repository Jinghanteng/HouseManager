package servlet.roleServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.glass.ui.Size;

import model.role.PageRole;
import model.role.Role;
import service.UserService;
import service.impl.UserServiceImpl;

/**
 * Servlet implementation class ForwardToRole
 * @param <E>
 */
@WebServlet("/to/role")
public class ForwardToRoleServlet<E> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardToRoleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		UserService<E> userService=new UserServiceImpl<>();
		int page=1;
		String str=request.getParameter("page");
		if (str!=null) {
			 page=Integer.parseInt(str);
		}
		PageRole<Role> pageRole=userService.pageRole(page, 4);
		request.setAttribute("pagerole", pageRole);
		request.getRequestDispatcher("/WEB-INF/user/role.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
