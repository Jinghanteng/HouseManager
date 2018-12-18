package servlet.activity;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.acyivity.Activity;
import model.acyivity.PageActivity;
import service.ActivityService;
import service.impl.ActivityServiceImpl;

/**
 * Servlet implementation class ForwardToActivityServlet
 */
@WebServlet("/to/activity")
public class ForwardToActivityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardToActivityServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ActivityService activityService=new ActivityServiceImpl();
		int page=1;
		
		
		PageActivity<Activity> pageActivity=activityService.pageActivity(page, 4);
		request.setAttribute("pageActivity", pageActivity);
		request.getRequestDispatcher("/WEB-INF/activity/activity.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
