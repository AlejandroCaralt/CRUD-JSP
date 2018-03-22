package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ControladorLogin.ProjectController;

public final class modificandoproyecto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    HttpSession objsession = request.getSession(false);
    String usuario = (String)objsession.getAttribute("usuario");
    if(usuario.equals("")){
        response.sendRedirect("index.jsp");
    } else {
        objsession.setAttribute("usuario", usuario);
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Menú</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">");
 out.print(usuario); 
      out.write("<a href=\"index.jsp\" onclick=\"");
objsession.removeAttribute("usuario");
      out.write("\">Cerrar Sesión </a></div>\n");
      out.write("        <h1>Hola usuario, acceso correcto</h1>\n");
      out.write("        <table border=1>\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Nombre</th>\n");
      out.write("                <th>Lenguajes</th>\n");
      out.write("                <th>GitHub</th>\n");
      out.write("                <th>Administrador</th>\n");
      out.write("                <th>FechaInicio</th>\n");
      out.write("                <th>Descripción</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");

                ProjectController cp = new ProjectController();
                
            
      out.write("\n");
      out.write("            ");
      out.print( cp.getUpdateProject());
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("    <p><a href=\"menu.jsp\">Volver</a></p>\n");
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
