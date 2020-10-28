package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MenuPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("        <body bgcolor=\"#161C38\" text=\"#FFFFFF\"\n");
      out.write("\tlink=\"#FFFFFF\" vlink=\"#E50A0A\" alink=\"#E50A0A\">\n");
      out.write("            <center><h1>SISTEMA DE VENTAS</h1></center>\n");
      out.write("       \n");
      out.write("        <center><a href=\"CrearClienteIndividual.jsp\">1. Crear cliente individual</a></center><br>\n");
      out.write("        <center><a href=\"ListaClienteIndividual.jsp\">2. Reporte cliente individual</a></center><br>\n");
      out.write("        <center><a href=\"CrearClienteEmpresa.jsp\">3. Crear cliente empresa</a></center><br>\n");
      out.write("        <center><a href=\"ListaClienteEmpresa.jsp\">4. Reporte cliente empresa</a></center><br>\n");
      out.write("        <center><a href=\"CrearProducto.jsp\">5. Crear producto </a></center><br>\n");
      out.write("        <center><a href=\"ListaProducto.jsp\">6. Reporte producto</a></center><br>\n");
      out.write("        <center><a href=\"CrearOrdenCompra.jsp\">7. Crear Orden de compra</a></center><br>\n");
      out.write("        <center><a href=\"ListaOrdenCompra.jsp\">8. Reporte orden de compra</a></center><br>\n");
      out.write("        \n");
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
