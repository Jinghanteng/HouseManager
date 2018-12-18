package servlet.repair;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.repair.PageRepair;
import model.repair.Repair;
import service.RepairService;
import service.impl.RepairServiceImpl;

/**
 * Servlet implementation class ForwardToRepair
 */
@WebServlet("/to/repair")
public class ForwardToRepair extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardToRepair() {
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
		
		
		RepairService repairService=new RepairServiceImpl();
		PageRepair<Repair> repair=repairService.pageRepair(page, 4);
		request.setAttribute("repair", repair);
		request.getRequestDispatcher("/WEB-INF/repair/repair.jsp").forward(request, response);
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
