package servlet.compact;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.compact.Compact;
import service.CompactService;
import service.impl.CompactServiceImpl;

/**
 * Servlet implementation class AddCompactServlet
 */
@WebServlet("/AddCompactServlet")
public class AddCompactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddCompactServlet() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		CompactService compactService = new CompactServiceImpl();
		String houser_id = request.getParameter("house_id");
		String user_id = request.getParameter("user_id");
		String begintime = request.getParameter("begintime");
		String endtime = request.getParameter("endtime");
		String rental = request.getParameter("rental");
		String payment = request.getParameter("payment");
		String pledge = request.getParameter("pledge");
		String periods = request.getParameter("periods");
		SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		Date date1 = null;
		Date date2=null;
		try {
			date1 = sDateFormat.parse(begintime);
			date2=sDateFormat.parse(endtime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Compact compact = new Compact();
		compact.setHouse_id(Integer.parseInt(houser_id));
		compact.setPayment(payment);
		compact.setPeriods(periods);
		compact.setPledge(pledge);
		compact.setRental(Double.valueOf(rental));
		compact.setUser_id(Integer.parseInt(user_id));
		compact.setEndtime(date2);
		compact.setBegintime(date1);
		compactService.AddCompact(compact);
		response.sendRedirect("/HouseManager/to/compact");

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
