import java.sql.*;
class OracleCon{
public static void main(String args[]){
try{
//step1 load the driver class
Class.forName("oracle.jdbc.driver.OracleDriver"); //C:\Program Files\Java\jdk1.6.0_27\jre\lib\ext\ojdbc14.jar	oracle 10.2.0	jdk 1.6

//step2 create  the connection object
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","twinkle","manisha");

//step3 create the statement object
Statement stmt=con.createStatement();

//step4 execute query
ResultSet rs=stmt.executeQuery("select * from md");
System.out.println("output");
while(rs.next())
System.out.println(rs.getInt(1)+"  "+rs.getString(2));

//step5 close the connection object
con.close();

}catch(Exception e){ System.out.println(e);}

}
}