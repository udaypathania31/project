package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class leave_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("  <!DOCTYPE html>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("h1 {\n");
      out.write("    color: black;\n");
      out.write("    font-family: verdana;\n");
      out.write("    font-size: 300%;\n");
      out.write("}\n");
      out.write("div.background {\n");
      out.write("  background: url(uday.jpg) repeat;\n");
      out.write("  border: 2px solid black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.transbox {\n");
      out.write("  margin: 30px;\n");
      out.write("  background-color: #ffffff;\n");
      out.write("  border: 1px solid black;\n");
      out.write("  opacity: 0.6;\n");
      out.write("  filter: alpha(opacity=60); \n");
      out.write("}\n");
      out.write("\n");
      out.write("div.transbox p {\n");
      out.write("  margin: 5%;\n");
      out.write("  font-weight: bold;\n");
      out.write("  color: #000000;\n");
      out.write("}\n");
      out.write("ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a, .dropbtn {\n");
      out.write("    display: inline-block;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover, .dropdown:hover .dropbtn {\n");
      out.write("    background-color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li.dropdown {\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {background-color: #f1f1f1}\n");
      out.write("\n");
      out.write(".show {display:block;}\n");
      out.write("input[type=text], select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("    width: 100%;\n");
      out.write("    background-color:  #b30000;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("    background-color:  #b30000;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div {\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color:  #ff9999;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("<div class=\"background\">\n");
      out.write("  <div class=\"transbox\">\n");
      out.write("  \n");
      out.write("  <h1>LEAVE FORM</h1>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("  <li><a href=\"main.jsp\">HOME</a></li>\n");
      out.write("    \t\t<li><a href=\"preview.html\">ABOUT US</a></li>\n");
      out.write("    \t\t<li><a href=\"html.html\">SUBMISSIONS </a></li>\n");
      out.write("    \t\t<li><a href=\"image.html\">IMAGE GALARY</a></li>\n");
      out.write("    \t\t<li><a href=\"contact.jsp\">NEWS</a></li>\n");
      out.write("    \t\t<li><a href=\"index.jsp\">LOG IN</a></li>\n");
      out.write("    \t\t<li><a href=\"gradient.html\">CONTACT US</a></li>\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("  <form action=\"leave\">\n");
      out.write("    <label for=\"fname\">FIRST NAME</label>\n");
      out.write("    <input type=\"text\" id=\"fname\" name=\"firstname\" required>\n");
      out.write("\n");
      out.write("    <label for=\"lname\">LAST NAME</label>\n");
      out.write("    <input type=\"text\" id=\"lname\" name=\"lastname\" required>\n");
      out.write("\t\n");
      out.write("\t<label for=\"sid\">STUDENT ID</label>\n");
      out.write("    <input type=\"text\" id=\"sid\" name=\"sid\" required>\n");
      out.write("\n");
      out.write("    <label for=\"req\">REQUIRED FROM</label>\n");
      out.write("    <input type=\"text\" id=\"req\" name=\"rqe\" required>\n");
      out.write("    \n");
      out.write("    <label for=\"till\">TILL DATE</label>\n");
      out.write("    <input type=\"text\" id=\"till\" name=\"till\" required>\n");
      out.write("    \n");
      out.write("    <br>\n");
      out.write("\t<label for=\"scholar\">SCHOLAR</label>\n");
      out.write("    <select id=\"scholar\" name=\"scholar\">\n");
      out.write("      <option value=\"hostler\">HOSTLER</option>\n");
      out.write("      <option value=\"day scholar\">DAY SCHOLAR</option>\n");
      out.write("     \n");
      out.write("    </select>\n");
      out.write("    <br>\n");
      out.write("\t\n");
      out.write("\t<br>\n");
      out.write("    Phone Number:<br>\n");
      out.write("    <input type=\"text\" id=\"phone\" name=\"phone\" required>\n");
      out.write("\t<br><br>\n");
      out.write("  <input type = \"submit\" value = \"submit\"></form>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("    <div  class=\"zoomin\" style=\"background-color:grey;color:white;padding:40px;\">\n");
      out.write("<a href=\"https://www.facebook.com/Autoblog/\"><img src=\"ff.png\" alt=\"Smiley face\" align=\"left\" height=\"100\" width=\"100\"></a>\n");
      out.write("<a href=\"https://www.instagram.com/autoblog/?hl=en\"><img src=\"ii.png\" alt=\"Smiley face\" align=\"left\" height=\"100\" width=\"100\">\n");
      out.write("<a href=\"https://twitter.com/therealautoblog?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor\"><img src=\"tt.png\" alt=\"Smiley face\" align=\"left\" height=\"100\" width=\"100\">\n");
      out.write("<a href=\"https://www.youtube.com/channel/UCkLbQpvXfOO18uYFjg7SkOA\"><img src=\"yy.png\" alt=\"Smiley face\" align=\"left\" height=\"100\" width=\"100\">\n");
      out.write("<a href=\"https://acadview.com/student/enrollments\"><img src=\"pp.png\" alt=\"Smiley face\" align=\"left\" height=\"100\" width=\"100\">\n");
      out.write("    <a href=\"https://acadview.com/student/enrollments\"><img src=\"acad.png\" alt=\"Smiley face\" align=\"left\" height=\"100\" width=\"100\">\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
