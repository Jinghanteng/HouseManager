package servlet.paymentinformation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.paymentinformation.PagePaymentinformation;
import model.paymentinformation.Paymentinformation;
import service.PaymentinformationService;
import service.impl.PaymentinformationServiceImpl;

/**
 * Servlet implementation class ForwardTopaymentinformation
 */
@WebServlet("/to/ForwardTopaymentinformation")
public class ForwardTopaymentinformation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardTopaymentinformation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int page=1;
		String str=request.getParameter("page");
		if (str!=null) {
			page=Integer.parseInt(str);
		}
		
		PaymentinformationService paymentinformationService=new PaymentinformationServiceImpl();
		PagePaymentinformation<Paymentinformation> pagePaymentinformation=paymentinformationService.pagePaymentinformation(page, 4);
		request.setAttribute("pagePaymentinformation", pagePaymentinformation);
		request.getRequestDispatcher("/WEB-INF/paymentinformation/paymentinformation.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
