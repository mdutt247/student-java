<!DOCTYPE html>
<%@ page contentType="text/html;charset=windows-1252" language="java" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>Success</title>
  </head>
  <body>
  Successfully login<br /> 
Session Value<br /> 
<% 
out.print("User Name : " + session.getAttribute("sUserID") + "<br>"); 
out.print("Name :" + session.getAttribute("sUserName")); 
%> 
  </body>
</html>