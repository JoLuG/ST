package org.apache.jsp.INT;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Crear_002dCuenta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../CSS/EstiloP.css\">\n");
      out.write("        <title>Crear-Cuenta</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"Cuadro-morado\"></div>\n");
      out.write("        <div class=\"Cuadro-blanco-1\">\n");
      out.write("            <img src=\"../IMG/logo.png\" alt=\"Logotipo\" title=\"Logotipo\" class=\"Logo\">\n");
      out.write("            <h1 class=\"titulo\">Crear Cuenta</h1>\n");
      out.write("            <form action=\"Crear-Cuenta2.jsp\" method=\"post\" class=\"Form-Registro\">\n");
      out.write("\n");
      out.write("                <label for=\"Usuario\" class=\"etiqueta\">Usuario:</label> <br>\n");
      out.write("                <input type=\"text\" id=\"Usuario\" name=\"Usuario\" class=\"inp-text\" placeholder=\"Usuario\" required> <br>\n");
      out.write("\n");
      out.write("                <label for=\"Nombre\" class=\"etiqueta\">Nombre:</label> <br>\n");
      out.write("                <input type=\"text\" id=\"Nombre\" name=\"Nombre\" class=\"inp-text\" placeholder=\"Nombre\" required> <br>\n");
      out.write("\n");
      out.write("                <label for=\"apaterno\" class=\"etiqueta\">Apellido Paterno:</label> <br>\n");
      out.write("                <input type=\"text\" id=\"apaterno\" name=\"apaterno\" class=\"inp-text\" placeholder=\"Apellido Paterno\" required> <br>\n");
      out.write("\n");
      out.write("                <label for=\"amaterno\" class=\"etiqueta\">Apellido Materno:</label> <br>\n");
      out.write("                <input type=\"text\" id=\"amaterno\" name=\"amaterno\" class=\"inp-text\" placeholder=\"Apellido Materno\" required> <br>     \n");
      out.write("\n");
      out.write("                <label for=\"genero\" class=\"etiqueta\">Genero:</label> <br>\n");
      out.write("                <select name=\"genero\" id=\"genero\" class=\"inp-text\">               \n");
      out.write("                    <option value=\"Hombre\">Hombre</option>\n");
      out.write("                    <option value=\"Mujer\">Mujer</option>\n");
      out.write("                </select> <br> <br>\n");
      out.write("                <center>\n");
      out.write("                    <input type=\"submit\" value=\"Siguiente\" class=\"btn-Registrar\">\n");
      out.write("                </center>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
