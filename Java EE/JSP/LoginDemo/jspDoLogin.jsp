<!DOCTYPE html>
<%@ page language="java" import="java.sql.*" contentType="text/html;charset=windows-1252"%>

<%
    Connection conn = null; 
    ResultSet rs = null; 
    PreparedStatement ps = null; 

    String u = request.getParameter("txtUName"); 
    String p = request.getParameter("txtPwd"); 
	
    String message="User login successful"; 
	
    try{ 
	    Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","madhav","madhav");
		
		ps = conn.prepareStatement("SELECT * FROM userdetails where uname=? and pass=?"); 
		
		ps.setString(1,u); 
		ps.setString(2,p); 

		rs = ps.executeQuery(); 
	
		if(rs.next()){ 
			String fullName = rs.getString("firstName")+" " + rs.getString("lastName"); 
			session.setAttribute("sUserName",rs.getString("uname"));  
			session.setAttribute("sFullName",fullName);
			response.sendRedirect("jspSuccess.jsp?msg="+message); 
		} 
		else{ 
			message="<br><b>No user / password not matched</b><br><br>" ; 
			response.sendRedirect("jspLogin.jsp?msg="+message); 
		} 
    } 
    catch(Exception e){ 
		out.println(e.getMessage());
        e.printStackTrace(); 
    } 

    
    try{ 
         if(ps!=null){ 
             ps.close(); 
         } 
         if(rs!=null){ 
             rs.close(); 
         } 
         if(conn!=null){ 
          conn.close(); 
         } 
    } 
    catch(Exception e){ 
		out.println(e.getMessage());
        e.printStackTrace(); 
    } 
%>