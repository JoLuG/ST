package org.apache.jsp.INT;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class VAprobada_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"../CSS/Estilo-Verificacion.css\">\n");
      out.write("        <title>Verificacion</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"Cuadro-morado\"></div>\n");
      out.write("    <div class=\"Cuadro-blanco-1\">\n");
      out.write("        <img src=\"../IMG/logo.png\" alt=\"Logotipo\" title=\"Logotipo\" class=\"Logo\">\n");
      out.write("        <h1 class=\"titulo\">Crear Cuenta</h1>\n");
      out.write("        <form action=\"\" method=\"post\" class=\"Form-Registro\">       \n");
      out.write("            \n");
      out.write("            <label for=\"telefono\" class=\"etiqueta\">Teléfono:</label> <br>\n");
      out.write("            <input type=\"text\" id=\"telefono\" name=\"telefono\" class=\"inp-text\" placeholder=\"Teléfono\"> <br>\n");
      out.write("\n");
      out.write("            <label for=\"correo\" class=\"etiqueta\">Correo:</label> <br>\n");
      out.write("            <input type=\"text\" id=\"correo\" name=\"correo\" class=\"inp-text\" placeholder=\"Correo\"> <br>\n");
      out.write("           \n");
      out.write("            <label for=\"password\" class=\"etiqueta\">Password:</label> <br>\n");
      out.write("            <input type=\"password\" id=\"password\" name=\"password\" class=\"inp-text\" placeholder=\"Password\"> \n");
      out.write("            \n");
      out.write("            <label for=\"passwordC\" class=\"etiqueta\">Confirmar Password:</label> <br>\n");
      out.write("            <input type=\"password\" id=\"passwordC\" name=\"passwordC\" class=\"inp-text\" placeholder=\"Confirmar Password\"> <br> <br>\n");
      out.write("            <center>\n");
      out.write("                <input type=\"submit\" value=\"Registrar\" class=\"btn-Registrar\">\n");
      out.write("            </center>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"overlay\">\n");
      out.write("        <div class=\"popup1\">\n");
      out.write("            <center>\n");
      out.write("                <br>\n");
      out.write("                <span class=\"subtitulo\" style=\"color: #7972E6 ;\">Felicidades!!</span><br><br>\n");
      out.write("                <span class=\"p-txt\">Tu cuenta se a creado exitosamente</span><br><br>\n");
      out.write("                <img src=\"../IMG/aprobacion.jpg\" alt=\"Aprobacion\" class=\"img-ver\"><br><br>\n");
      out.write("                <a href=\"InicioSesion.jsp\" class=\"btn-terminar\">Terminar</a>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
