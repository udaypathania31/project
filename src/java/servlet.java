/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.* ; 
/**
 *
 * @author lenovo
 */
@WebServlet(urlPatterns = {"/login"})
public class servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {    
            String user = request.getParameter("nm");              
            String password = request.getParameter("pwd");
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            out.println(user);
            out.println(password);
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/application approval","uday","uday");  
            Statement stmt=con.createStatement();  
            String query = "select * from login";
            ResultSet rs=stmt.executeQuery(query);
            int flag = 0;
            HttpSession session = request.getSession();
            while(rs.next()){
                if(user.equals(rs.getString(1)) && password.equals(rs.getString(2))){
                    session.setAttribute("user",user);
                    out.println("success!!");
                    response.sendRedirect("main.jsp");
                    flag = 1;    
                    break;
                }
            }         
            if(flag == 0){
                out.println("Wrong username and/or password!!");                         
            }          
            con.close();            
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