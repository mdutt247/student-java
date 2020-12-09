import java.sql.*;
class MySqlCon{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost/shop","root","");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from customers");
System.out.println("output:");
while(rs.next())
System.out.println(rs.getInt(1)+"  "+rs.getString(2));

con.close();

}catch(Exception e){ System.out.println(e);}

}
}