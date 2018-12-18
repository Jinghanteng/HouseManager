package servlet.logistic;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.logistics.Logistics;
import service.LogisticService;
import service.impl.LogisticServiceImpl;

/**
 * Servlet implementation class AddLogisticServlet
 */
@WebServlet("/AddLogisticServlet")
public class AddLogisticServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddLogisticServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		LogisticService logisticService=new LogisticServiceImpl();
		Logistics l=new Logistics();
		l.setName(request.getParameter("name"));
		l.setIdCard(request.getParameter("idcard"));
		l.setTel(Integer.parseInt(request.getParameter("tel")));
		l.setSex(request.getParameter("sex"));
		l.setRole_id(Integer.parseInt(request.getParameter("role_id")));
		l.setSalary(Double.parseDouble(request.getParameter("salary")));
		l.setPlace(request.getParameter("place"));
		SimpleDateFormat sm=new SimpleDateFormat("YYYY-MM-dd HH:MM:ss");
		try {
			l.setTime(sm.parse(request.getParameter("time")));
			logisticService.addLogistic(l);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("/HouseManager/to/logistics");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
