package com.capgemini.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.capgemini.movie.dao.IQueryMapper;
import com.capgemini.movie.util.DBConnection;
import com.capgemini.movie.bean.MovieBean;
import com.capgemini.movie.exception.MovieException;

public class MovieDAOImpl implements IMovieDAO{

	@Override
	public ArrayList<MovieBean> fetchMovies(String city, String movie) throws SQLException, MovieException {
		PreparedStatement stmt=null;

		ResultSet rs=null;
		ArrayList<MovieBean> al=new ArrayList();
	
			Connection conn=DBConnection.getConnection();
			stmt=conn.prepareStatement(IQueryMapper.FETCH_MOVIES);
			//System.out.println(city+" "+movie);
			stmt.setString(1,city);
			stmt.setString(2, movie);
			 rs=stmt.executeQuery();
			while(rs.next()) {
				MovieBean m=new MovieBean();
				m.setMovieId(rs.getInt(1));
				m.setMovieName(rs.getString(2));
				m.setCity(rs.getString(3));
				m.setHallname(rs.getString(4));
				m.setLocation(rs.getString(5));
				m.setStatus(rs.getString(6));
				al.add(m);
			}
		
		
		return al;
		}

	@Override
	public boolean bookMovie(int movieId) throws SQLException, MovieException {
		PreparedStatement stmt=null;
boolean temp=false;
		ResultSet rs=null;
		
	
			Connection conn=DBConnection.getConnection();
			stmt=conn.prepareStatement(IQueryMapper.BOOK_MOVIE);
			stmt.setString(1, "UNAVAILABLE");
			stmt.setInt(2,movieId);
			int queryResult=stmt.executeUpdate();
			if(queryResult==0) {
				temp=false;
			}
			else
			{
				temp=true;
			}
			return temp;
}

}
