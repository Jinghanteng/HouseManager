package servlet.logistic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.LogisticsDaoImpl;
import model.logistics.Logistics;
import model.logistics.PageLogistics;
import service.LogisticService;
import service.impl.LogisticServiceImpl;

/**
 * Servlet implementation class ForwardToLogisticServlet
 */
@WebServlet("/to/logistics")
public class ForwardToLogisticServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardToLogisticServlet() {
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
		LogisticService logisticService=new LogisticServiceImpl();
		String str=request.getParameter("page");
		if (str!=null) {
			page=Integer.parseInt(str);
		}
		System.out.println(page);
		PageLogistics<Logistics> pageLogistics=logisticService.pageLogistics(page, 4);
		System.out.println("ceshi:"+pageLogistics.getPagesize());
		request.setAttribute("logistics", pageLogistics);
		request.getRequestDispatcher("/WEB-INF/logistics/logistics.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
