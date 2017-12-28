package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class principal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/jspf/jscss.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/top.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/bottom.jspf");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"../../css/base.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"../../bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script src=\"../../jquery/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../../bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    ");
      out.write("\n");
      out.write("        \n");
      out.write("        <title>Warlock Soft</title>\n");
      out.write("\t\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\t\talert(\"Bienvenido a Warlock Soft!\");\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <h1>Bienvenido\n");
      out.write("        ");
      ws.Empleado validUsuario = null;
      synchronized (session) {
        validUsuario = (ws.Empleado) _jspx_page_context.getAttribute("validUsuario", PageContext.SESSION_SCOPE);
        if (validUsuario == null){
          validUsuario = new ws.Empleado();
          _jspx_page_context.setAttribute("validUsuario", validUsuario, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((ws.Empleado)_jspx_page_context.findAttribute("validUsuario")).getNombre())));
      out.write("\n");
      out.write("    </h1> \n");
      out.write("\t\t\n");
      out.write("\t\t<footer></footer>\n");
      out.write("\n");
      out.write("\t\t<script src=\"js/jquery.js\"></script>\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        Warlock Soft\n");
      out.write("        <div>\n");
      out.write("            <a href=\"index\" class=\"btn btn-mini btn-primary\">Inicio</a>\n");
      out.write("            <a href=\"SCategoria\" class=\"btn btn-mini btn-primary\">Asociaciones</a>\n");
      out.write("            <a href=\"SCategoria\" class=\"btn btn-mini btn-primary\">Habilidades</a>\n");
      out.write("            <a href=\"SCategoria\" class=\"btn btn-mini btn-primary\">Proyecto / Tareas</a>\n");
      out.write("            <a href=\"categoria?op=perfil\" class=\"btn btn-mini btn-primary\">Perfil</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"content\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"bottom\">\n");
      out.write("        &COPY; 2017\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
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
