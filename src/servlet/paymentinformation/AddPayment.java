package servlet.paymentinformation;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.paymentinformation.Paymentinformation;
import service.PaymentinformationService;
import service.impl.PaymentinformationServiceImpl;

/**
 * Servlet implementation class AddPayment
 */
@WebServlet("/AddPayment")
public class AddPayment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddPayment() {
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
		PaymentinformationService p = new PaymentinformationServiceImpl();

		Paymentinformation pay = new Paymentinformation();
		pay.setHouse_id(Integer.parseInt(request.getParameter("house_id")));
		pay.setOther(request.getParameter("other"));
		String payment = request.getParameter("payment");
		int a = Integer.parseInt(payment);
		pay.setPayment(a);
		String date = request.getParameter("time");
		SimpleDateFormat stime = new SimpleDateFormat("YYYY-MM-dd HH:MM:ss");
		Date date2;
		try {
			date2 = stime.parse(date);
			pay.setTime(date2);
			pay.setUser_id(Integer.parseInt(request.getParameter("user_id")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		p.add(pay);
		response.sendRedirect("/HouseManager/to/ForwardTopaymentinformation");

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
