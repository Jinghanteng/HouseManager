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
 * Servlet implementation class UpdateHouseServlet
 * @param <E>
 */
@WebServlet("/house/update")
public class UpdateHouseServlet<E> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateHouseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//���ӷ���
		request.setCharacterEncoding("utf-8");
		HouseService<E> houseService=new HouseServiceImpl();
		String location=request.getParameter("location");
		String plot=request.getParameter("plot");
		int unit=Integer.parseInt(request.getParameter("unit"));
		int floor=Integer.parseInt(request.getParameter("floor"));
		int room=Integer.parseInt(request.getParameter("room"));
		int people=Integer.parseInt(request.getParameter("people"));
		HttpSession session=request.getSession();
		int id1=(int) session.getAttribute("id");
		
		double area=Double.parseDouble(request.getParameter("area"));
		
		
		String orientation=request.getParameter("orientation");
		String finish=request.getParameter("finish");
		String gas=request.getParameter("gas");
		House house=new House(id1,location, plot, unit, floor, room, area, orientation, finish, gas, people);
//		House house=new House();
//		house.setLocation(location);
//		house.setArea(area);
//		house.setFinish(finish);
//		house.setFloor(floor);
//		house.setGas(gas);
//		house.setOrientation(orientation);
//		house.setPeople(people);
//		house.setPlot(plot);
//		house.setRoom(room);
//		house.setUnit(unit);
		System.out.println(house.getArea());
		houseService.updateHouse(house);
		response.sendRedirect("/HouseManager/to/houseinfo");
		
		
		
		
	}

}
