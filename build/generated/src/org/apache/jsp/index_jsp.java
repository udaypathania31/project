package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html >\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("    background: url(advice.jpg);\n");
      out.write("    width: 100%;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login {\n");
      out.write("      margin: 20px auto;\n");
      out.write("    width: 300px;\n");
      out.write("    padding: 30px 25px;\n");
      out.write("    background: rgb(255,255,255,0.4);\n");
      out.write("    border: 1px solid #c4c4c4;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1.login-title {\n");
      out.write("  margin: -28px -25px 25px;\n");
      out.write("    padding: 15px 25px;\n");
      out.write("    line-height: 30px;\n");
      out.write("    font-size: 25px;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    color: #333;\n");
      out.write("    text-align: center;;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-input {\n");
      out.write("  width: 285px;\n");
      out.write("  height: 50px;\n");
      out.write("  margin-bottom: 25px;\n");
      out.write("  padding-left:10px;\n");
      out.write("  font-size: 15px;\n");
      out.write("  background: #fff;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("}\n");
      out.write(".login-input:focus {\n");
      out.write("    border-color:#6e8095;\n");
      out.write("    outline: none;\n");
      out.write("  }\n");
      out.write(".login-button {\n");
      out.write("  width: 100%;\n");
      out.write("  height: 50px;\n");
      out.write("  padding: 0;\n");
      out.write("  font-size: 20px;\n");
      out.write("  color: #fff;\n");
      out.write("  text-align: center;\n");
      out.write("  background: #f0776c;\n");
      out.write("  border: 0;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  cursor: pointer; \n");
      out.write("  outline:0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-lost\n");
      out.write("{\n");
      out.write("  text-align:center;\n");
      out.write("  margin-bottom:0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-lost a\n");
      out.write("{\n");
      out.write("  color:#666;\n");
      out.write("  text-decoration:none;\n");
      out.write("  font-size:13px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form class=\"login\" action=\"login\" method=\"post\">\n");
      out.write("    <h1 class=\"login-title\">Login</h1>\n");
      out.write("    <input type=\"text\" class=\"login-input\" name=\"nm\" placeholder=\"User name\" autofocus required>\n");
      out.write("    <input type=\"password\" class=\"login-input\" placeholder=\"Password\" name=\"pwd\" required>\n");
      out.write("    <input type=\"submit\" value=\"Lets Go\" class=\"login-button\">\n");
      out.write("    </form>\n");
      out.write("    </body>\n");
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
