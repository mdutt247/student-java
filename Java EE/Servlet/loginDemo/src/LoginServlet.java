//LoginServlet.java 
import java.io.*; 
import java.sql.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import java.io.IOException; 
import java.io.PrintWriter; 
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.http.HttpSession; 

// to compile it manually, when u r using tomcat, it will require servlet-api.jar in classpath

public class LoginServlet extends HttpServlet { 

    private Connection con; 
    private PreparedStatement ps=null; 
        //private HttpServletResponse resp="a"; 
        private String WELCOME_PAGE = "welcome.html"; 
        private String ERROR_PAGE = "error.html"; 

    public void init() throws ServletException { 

        try { 
            Class.forName("oracle.jdbc.driver.OracleDriver");   // \Tomcat.ver.no\lib\ojdbc14.jar must be in classpath for oracle 10g
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","madhav","madhav"); 
            ps = con.prepareStatement("select * from userdetails where uname=? and pass=?"); 
        }//try 

        catch(Exception e){ 
            e.printStackTrace(); 
            throw new ServletException("Initialization failed, Unable to get DB connection"); 
        }//catch 
    }//init 

    public void service (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException { 

        //res.setContentType("text/html"); 
        PrintWriter out=res.getWriter(); 
        try { 
            String uname=req.getParameter("uname"); 
            String pass= req.getParameter("pass"); 

            if(uname==null||uname.equals("")||pass==null|| pass.equals("")) { 
                    res.sendRedirect(ERROR_PAGE); 
                /*out.println("<html><body><center>"); 
                out.println("<li><i>User Name and Password cannot be empty</i></li><br/>"); 
                out.println("<li><i>We cannot log you into your account at this time. Please try again later</i>"); 
                out.println("</center></body></html>");*/ 
                return; 
            }//if 

            ps.setString(1,uname); 
            ps.setString(2,pass); 
            ResultSet rs=ps.executeQuery(); 

            //out.println("<html><body>"); 
            if (rs.next()){ 
                res.sendRedirect(WELCOME_PAGE); 
                                /* 
                out.println("<h3>Welcome, "+uname+"</h3><br/>"); 
                out.println("<h2>Enjoy browsing the Site</h2>");*/ 
            } 
            else 
                res.sendRedirect(ERROR_PAGE); 
            /*out.println("<h2>We cannot log you into your account at this time. Please try again later</h2>"); 
              out.println("</body></html>");*/ 
        }//try 
        catch(Exception e){ 
			e.printStackTrace();; 
			out.println("Unable to the process the request try after some time"); 
			out.println(e.getMessage());
        }//catch 
    }//service 

    public void destroy () { 
        System.out.println("In destroy"); 
        try {con.close();} 
        catch(Exception e){
			e.printStackTrace();;
		} 
    }//destroy 
}//class