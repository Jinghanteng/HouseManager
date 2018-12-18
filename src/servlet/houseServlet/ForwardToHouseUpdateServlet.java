package servlet.houseServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.house.House;
import service.HouseService;
import service.impl.HouseServiceImpl;

/**
 * Servlet implementation class ForwardToAddServlet
 * @param <E>
 */
@WebServlet("/to/update")
public class ForwardToHouseUpdateServlet<E> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardToHouseUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		
		HouseService<E> houseService=new HouseServiceImpl();
		int id =Integer.parseInt(request.getParameter("id"));
		HttpSession session=request.getSession();
		session.setAttribute("id", id);
		House house=houseService.getHouseById(id);
		request.setAttribute("house", house);
		
		request.getRequestDispatcher("/WEB-INF/house/update.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
