package sessionsinjsp;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Controller() {
        
    }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Firstname = request.getParameter("firstname");
		String Lastname = request.getParameter("lastname");
		if(Firstname.equals("Naidu") && Lastname.equals("Bhavana"))
		{
			request.getSession().invalidate();
			HttpSession newSession = request.getSession();
			newSession.setMaxInactiveInterval(4000);
			response.sendRedirect("submit.jsp");
		}
		
//		response.getWriter().println("First name is :" +Firstname);
//		response.getWriter().println("Last name is :" +Lastname);
//	
	
	}

}
