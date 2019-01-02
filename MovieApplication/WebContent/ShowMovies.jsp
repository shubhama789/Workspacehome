<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="com.capgemini.movie.bean.*,java.util.*"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<MovieBean> m=(ArrayList)request.getAttribute("movies");
	out.println("<html><body><form action=MovieController method=post><table><tr><th>MovieId</th><th>Movie Name</th><th>City</th><th>Hall Name</th><th>Location</th><th>Status</th></tr>");
	for(MovieBean b:m){
		out.println("<tr><td>"+b.getMovieId()+"</td><td><input type='hidden' value='"+b.getMovieId()+"' name=id></td><td>"+b.getMovieName()+"</td><td>"+b.getCity()+"</td><td>"+b.getHallname()+"</td><td>"+b.getLocation()+"</td><td>"+b.getStatus()+"</td><td><input type=submit value=book name=book></td></tr>");
		out.println("</br>");
	}
	out.println("</table></form></body></html>"); 

%>
<%-- <c:forEach var="b" items="${m }">

    <td>
        <c:out value="${b}" />
    </td>
</c:forEach> --%>

</body>
</html>