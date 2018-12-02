import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.* ; 
import javax.servlet.http.HttpSession;
/**
 *
 * @author lenovo
 */
@WebServlet(urlPatterns = {"/leave"})
public class leave extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) { 
            String first = request.getParameter("firstname");              
            String last = request.getParameter("lastname");
            String sid = request.getParameter("sid");
            String rqe = request.getParameter("rqe");
            String till = request.getParameter("till");
            String scholar = request.getParameter("scholar");
            String phone = request.getParameter("phone");
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/application approval","uday","uday");  
            Statement stmt = con.createStatement();      
             String query = "insert into leave  values('"+first+"','"+last+"','"+sid+"','"+rqe+"','"+till+"','"+scholar+"','"+phone+"')";             
            String query2 = "select * from leave";
            ResultSet rs = stmt.executeQuery(query2);
            HttpSession session = request.getSession();
            out.println("success");
           int count =0;
            int flag =0;
                    
            if(count==0){
                stmt.executeUpdate(query);
                response.sendRedirect("leave.jsp"); 
                flag =1;
                session.setAttribute("username",first); 
            }                        
            if(flag!=1 && count!=1){  
                out.println("success");
                out.println("failed to insert the data!!");
            }  
        }
        catch(Exception e){ System.out.println(e);}  
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        processRequest(request, response);        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        processRequest(request, response);        
    }
}

            
          