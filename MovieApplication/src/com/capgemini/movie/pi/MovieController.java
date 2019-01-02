package com.capgemini.movie.pi;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.movie.bean.MovieBean;
import com.capgemini.movie.service.*;

/**
 * Servlet implementation class MovieController
 */
@WebServlet("/MovieController")
public class MovieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IMovieInterface ie=new MovieImpl();
		System.out.println("gy64");
		if(request.getParameter("find")!=null) {
			if(request.getParameter("find").equals("find")) {
		ArrayList<MovieBean> al=new ArrayList();
		String city=request.getParameter("city");
		String movieName=request.getParameter("moviename");
		try {
		al=ie.fetchMovies(city, movieName);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		request.setAttribute("movies", al);
		request.getRequestDispatcher("/ShowMovies.jsp").forward(request, response);
			}
		}
		if(request.getParameter("book")!=null) {
			if(request.getParameter("book").equals("book"))
			{
			System.out.println("booked");	
			System.out.println(request.getParameter("id"));
				try {
				if(ie.bookMovie(Integer.parseInt(request.getParameter("id"))))
				{
					request.setAttribute("id",request.getParameter("id"));
					request.getRequestDispatcher("/success.jsp").forward(request, response);
				}
				}
				catch(Exception e) {
					
				}
			}
		}
	}

}
