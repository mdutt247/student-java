import java.sql.*;
class AccessCon{
public static void main(String args[]){
try{
//step1 load the driver class
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");	//http://ucanaccess.sourceforge.net/site.html

//step2 create  the connection object
Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/admin/Documents/Java/AccessDB07.accdb");

//step3 create the statement object
Statement stmt=con.createStatement();

//step4 execute query
ResultSet rs=stmt.executeQuery("select * from userTable");
System.out.println("output:");
while(rs.next())
System.out.println(rs.getInt(1)+"  "+rs.getString(2));

//step5 close the connection object
con.close();

}catch(Exception e){ System.out.println(e);}

}
}