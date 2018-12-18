package servlet.houseServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.house.House;
import model.house.PageInfo;
import service.HouseService;
import service.impl.HouseServiceImpl;

/**
 * Servlet implementation class ForwardHouseInfo
 */
@WebServlet("/to/houseinfo")
public class ForwardHouseInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ForwardHouseInfo() {
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
		HouseService houseService = new HouseServiceImpl();
		HttpSession session = request.getSession();
		session.getAttribute("rootUser");
		// List<House> list=houseService.getAllHouse();
		String str = request.getParameter("page");
		int page = 1;
		if (str != null) {
			page = Integer.parseInt(str);
		}
		PageInfo<House> pageInfo = houseService.getPageInfo(page, 4);
		request.setAttribute("pageInfo", pageInfo);
		request.getRequestDispatcher("/WEB-INF/house/house.jsp").forward(request, response);
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
