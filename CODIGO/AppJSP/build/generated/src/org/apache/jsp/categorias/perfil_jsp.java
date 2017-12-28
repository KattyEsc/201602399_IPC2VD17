package org.apache.jsp.categorias;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/categorias/../WEB-INF/jspf/jscss.jspf");
    _jspx_dependants.add("/categorias/../WEB-INF/jspf/top.jspf");
    _jspx_dependants.add("/categorias/../WEB-INF/jspf/bottom.jspf");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"css/base.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script src=\"jquery/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    ");
      out.write("\n");
      out.write("        <title>Warlock Soft</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <h2>Warlock Soft</h2> \n");
      out.write("        <div>\n");
      out.write("            <a href=\"sindex\" class=\"btn btn-primary btn-success\" type=\"button\">Inicio</a>\n");
      out.write("            <a href=\"scategoria\" class=\"btn btn-primary btn-success\" type=\"button\">Asociaciones</a>\n");
      out.write("            <a href=\"scategoria\" class=\"btn btn-primary btn-success\" type=\"button\">Habilidades</a>\n");
      out.write("            <a href=\"scategoria\" class=\"btn btn-primary btn-success\">Proyecto / Tareas</a>\n");
      out.write("            <a href=\"scategoria?op=perfil\" class=\"btn btn-primary btn-success\">Perfil</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"content\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                Este es tu perfil...\n");
      out.write("            </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"bottom\">\n");
      out.write("        &COPY; 2017\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
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
