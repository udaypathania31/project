package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class show_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("    padding: 20px;\n");
      out.write("    font-family: Arial;\n");
      out.write("}\n");
      out.write(".header {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  padding: 20px 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header a {\n");
      out.write("  float: left;\n");
      out.write("  color: black;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 12px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 18px; \n");
      out.write("  line-height: 25px;\n");
      out.write("  border-radius: 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header a.logo {\n");
      out.write("  font-size: 25px;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header a.active {\n");
      out.write("  background-color: dodgerblue;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header-right {\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Center website */\n");
      out.write(".main {\n");
      out.write("    max-width: 1000px;\n");
      out.write("    margin: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("    font-size: 50px;\n");
      out.write("    word-break: break-all;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row {\n");
      out.write("    margin: 10px -16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add padding BETWEEN each column */\n");
      out.write(".row,\n");
      out.write(".row > .column {\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create three equal columns that floats next to each other */\n");
      out.write(".column {\n");
      out.write("    float: left;\n");
      out.write("    width: 33.33%;\n");
      out.write("    display: none; /* Hide all elements by default */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after rows */ \n");
      out.write(".row:after {\n");
      out.write("    content: \"\";\n");
      out.write("    display: table;\n");
      out.write("    clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Content */\n");
      out.write(".content {\n");
      out.write("    background-color: white;\n");
      out.write("    padding: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The \"show\" class is added to the filtered elements */\n");
      out.write(".show {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the buttons */\n");
      out.write(".btn {\n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  padding: 12px 16px;\n");
      out.write("  background-color: white;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn.active1 {\n");
      out.write("  background-color: #666;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write(".header-left\n");
      out.write("{\n");
      out.write("    float:left;\n");
      out.write("}\n");
      out.write("table, td, th {\n");
      out.write("    border: 1px solid black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table {\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th {\n");
      out.write("    height: 50px;\n");
      out.write("    text-decoration:blink;\n");
      out.write("}\n");
      out.write(".buy\n");
      out.write("{\n");
      out.write(" background-color:#00ff00;\n");
      out.write(" width: 100%;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"header\">\n");
      out.write("    <div class=\"header-left\">\n");
      out.write("        <img src=\"images/user.png\" height=\"100 px\" width=\"80 px\"><br>\n");
      out.write("        <center>");
 out.println(session.getAttribute("name")); 
      out.write("</center>\n");
      out.write("    </div>    \n");
      out.write("  <div class=\"header-right\">\n");
      out.write("    <a class=\"active\" href=\"buy.jsp\">Buy</a>\n");
      out.write("    <a href=\"sell.jsp\">Sell</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- MAIN (Center website) -->\n");
      out.write("<div class=\"main\">\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<div id=\"myBtnContainer\">\n");
      out.write("  <button class=\"btn \" onclick=\"filterSelection('all')\"> Show all</button>\n");
      out.write("  <button class=\"btn\" onclick=\"filterSelection('bikes')\">Bikes</button>\n");
      out.write("  <button class=\"btn\" onclick=\"filterSelection('cars')\"> Cars</button>\n");
      out.write("  <button class=\"btn\" onclick=\"filterSelection('mobile')\">Mobiles</button>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("    ");

    Connection conn;
    Statement ps;
    ResultSet rs=null;
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?user=root&password=root&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true");
     try {
         String str="select * from inventory where category='bikes'";
         ps=conn.createStatement();
         rs=ps.executeQuery(str);
         while(rs.next())
         {
          
 
      out.write("\n");
      out.write(" <div class=\"row\">\n");
      out.write(" <div class=\"column bikes\">\n");
      out.write(" <div class=\"content\">\n");
      out.write("   <h4>");
 out.println(rs.getString("title")); 
      out.write("</h4><br>\n");
      out.write("   <p>");
      out.print( rs.getString("Description") );
      out.write("</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    ");

         }
     }
     catch(Exception e)
     {
         out.println(e);
     }
    
      out.write("\n");
      out.write(" \n");
      out.write("      ");

    Class.forName("com.mysql.cj.jdbc.Driver");
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?user=root&password=root&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true");
     try {
         String stm="select * from inventory where category='cars'";
         ps=conn.createStatement();
         rs=ps.executeQuery(stm);
         while(rs.next())
         {
 
      out.write("\n");
      out.write("   <div class=\"column cars\">\n");
      out.write("    <div class=\"content\">\n");
      out.write("     <h4>");
      out.print( rs.getString("title") );
      out.write("</h4><br>\n");
      out.write("     <p>");
      out.print( rs.getString("Description") );
      out.write("</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    ");

         }
     }
     catch(Exception e)
     {
         out.println(e);
     }
    
      out.write("\n");
      out.write(" \n");
      out.write(" ");

    Class.forName("com.mysql.cj.jdbc.Driver");
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?user=root&password=root&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true");
     try {
         String stm="select * from inventory where category='mobile'";
         ps=conn.createStatement();
         rs=ps.executeQuery(stm);
         while(rs.next())
         {
 
      out.write("\n");
      out.write("  <div class=\"column mobile\">\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <div class=\"column cars\">\n");
      out.write("    <div class=\"content\">\n");
      out.write("     <h4>");
      out.print( rs.getString("title") );
      out.write("</h4><br>\n");
      out.write("     <p>");
      out.print( rs.getString("Description") );
      out.write("</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    ");

         }
     }
     catch(Exception e)
     {
         out.println(e);
     }
    
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("filterSelection(\"all\")\n");
      out.write("function filterSelection(c) {\n");
      out.write("  var x, i;\n");
      out.write("  x = document.getElementsByClassName(\"column\");\n");
      out.write("  if (c == \"all\") c = \"\";\n");
      out.write("  for (i = 0; i < x.length; i++) {\n");
      out.write("    w3RemoveClass(x[i], \"show\");\n");
      out.write("    if (x[i].className.indexOf(c) > -1) w3AddClass(x[i], \"show\");\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function w3AddClass(element, name) {\n");
      out.write("  var i, arr1, arr2;\n");
      out.write("  arr1 = element.className.split(\" \");\n");
      out.write("  arr2 = name.split(\" \");\n");
      out.write("  for (i = 0; i < arr2.length; i++) {\n");
      out.write("    if (arr1.indexOf(arr2[i]) == -1) {element.className += \" \" + arr2[i];}\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function w3RemoveClass(element, name) {\n");
      out.write("  var i, arr1, arr2;\n");
      out.write("  arr1 = element.className.split(\" \");\n");
      out.write("  arr2 = name.split(\" \");\n");
      out.write("  for (i = 0; i < arr2.length; i++) {\n");
      out.write("    while (arr1.indexOf(arr2[i]) > -1) {\n");
      out.write("      arr1.splice(arr1.indexOf(arr2[i]), 1);     \n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  element.className = arr1.join(\" \");\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("// Add active class to the current button (highlight it)\n");
      out.write("var btnContainer = document.getElementById(\"myBtnContainer\");\n");
      out.write("var btns = btnContainer.getElementsByClassName(\"btn\");\n");
      out.write("for (var i = 0; i < btns.length; i++) {\n");
      out.write("  btns[i].addEventListener(\"click\", function(){\n");
      out.write("    var current = document.getElementsByClassName(\"active\");\n");
      out.write("    current[0].className = current[0].className.replace(\" active\", \"\");\n");
      out.write("    this.className += \" active\";\n");
      out.write("  });\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
