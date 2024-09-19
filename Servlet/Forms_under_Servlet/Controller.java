package org.studyeasy;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public Controller() 
    {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(request.getParameter("Name"));
		response.getWriter().println(request.getParameter("Gender"));
		PrintWriter out = response.getWriter();
		String[] Languages = request.getParameterValues("Languages");
		if(Languages!= null)
		{
		for(int i =0;i<Languages.length;i++)
		{
			out.print(Languages[i]);
			out.print("<br/>");
		}
		}
		else
		{
			out.print("None selected");
		}
		response.getWriter().println(request.getParameter("country"));
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	

}
