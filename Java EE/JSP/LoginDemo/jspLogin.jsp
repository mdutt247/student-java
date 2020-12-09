<!DOCTYPE html>
<%@ page language="java" contentType="text/html;charset=windows-1252"%>
<% 
String msg=request.getParameter("msg"); 
if(msg==null || msg=="null"){ 
 msg=""; 
} 
%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>User Login JSP</title> 
<script> 
    function trim(s) 
    { 
        return s.replace( /^\s*/, "" ).replace( /\s*$/, "" ); 
    } 

    function validate() 
    { 
        if(trim(document.frmLogin.txtUName.value)=="") 
        { 
          alert("Login empty"); 
          document.frmLogin.txtUName.focus(); 
          return false; 
        } 
        else if(trim(document.frmLogin.txtPwd.value)=="") 
        { 
          alert("password empty"); 
          document.frmLogin.txtPwd.focus(); 
          return false; 
        } 
    } 
</script> 
  </head>
  <body>
    <div><%=msg%></div> 
    <form name="frmLogin" onSubmit="return validate();" action="jspDoLogin.jsp" method="post"> 
    User Name <input type="text" name="txtUName" /><br /> 
    Password <input type="password" name="txtPwd" /><br /> 
    <input type="submit" name="sSubmit" value="Submit" /> 
    </form> 
  </body>
</html>