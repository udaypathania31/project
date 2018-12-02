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
@WebServlet(urlPatterns = {"/ApplicationServlet"})
public class ApplicationServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) { 
            String first = request.getParameter("firstname");              
            String last = request.getParameter("lastname");
            String sid = request.getParameter("sid");
            String gender = request.getParameter("gender");
            String department = request.getParameter("department");
            String type = request.getParameter("type");
            String phone = request.getParameter("phone");
            String regarding = request.getParameter("regarding");
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/application approval","uday","uday");  
            Statement stmt = con.createStatement();      
            String query = "insert into application  values('"+first+"','"+last+"','"+department+"','"+type+"','"+regarding+"','"+gender+"','"+phone+"','"+sid+"')";             
            String query2 = "select * from application"; 
            ResultSet rs = stmt.executeQuery(query2);
            HttpSession session = request.getSession();
            
           int count =0;
            int flag =0;
                    
            if(count==0){
                stmt.executeUpdate(query);
                response.sendRedirect("main.jsp"); 
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