import java.sql.*;
class MSSqlCon{
public static void main(String args[]){
try{

Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress:1433;databaseName=rmdb;integratedSecurity=true");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from tblUserMaster");
System.out.println("output:");
while(rs.next())
System.out.println(rs.getInt(1)+"  "+rs.getString(2));

con.close();

}catch(Exception e){ System.out.println(e);}

}
}