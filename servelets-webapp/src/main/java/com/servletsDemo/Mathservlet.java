package com.servletsDemo;


import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mathservlet
 */
@WebServlet("/mat")
public class Mathservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mathservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		String query=request.getQueryString();
		out.println(query);
		String array[]=query.split("=");
		int n=Integer.parseInt(array[1]);
		
		int i=1;
		
		int fact=1;
		while(i<=n) {
			fact*=i;
			i++;
		}
		out.println("Factorial of "+n+" is ="+fact);
	}

}
