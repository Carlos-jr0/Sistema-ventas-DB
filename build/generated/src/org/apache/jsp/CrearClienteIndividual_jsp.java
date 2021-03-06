package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Individual;
import utilerias.InformacionDAO;

public final class CrearClienteIndividual_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#893546\" text=\"#FFFFFF\"\n");
      out.write("\tlink=\"#25B01A\" vlink=\"#1A2CB0\" alink=\"#E50A0A\">\n");
      out.write("        <h1>Agregar nuevos clientes</h1>\n");
      out.write("        ");
 
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String direccion = request.getParameter("direccion");
            String dpi = request.getParameter("dpi");
            if(nombre==null && apellido==null && direccion==null && dpi==null){
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"CrearClienteIndividual.jsp\" method=\"POST\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"nombre\">Nombre: </label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"nombre\" name=\"nombre\" aria-describedby=\"emailHelp\">              \n");
      out.write("            </div>            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"apellido\">Apellido: </label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"apellido\" name=\"apellido\" aria-describedby=\"emailHelp\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"direccion\">Dirección: </label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"direccion\" name=\"direccion\" aria-describedby=\"emailHelp\">\n");
      out.write("            </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("              <label for=\"dpi\">Dpi: </label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"dpi\" name=\"dpi\" aria-describedby=\"emailHelp\">\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Agregar</button>\n");
      out.write("    \n");
      out.write("        </form>\n");
      out.write("        ");

            }
              else{
                //1. Crear una instancia de CarreraDAO
                InformacionDAO informacionDao = new InformacionDAO(); 
                //2. Crear una instancia de Carrera
                Individual individual = new Individual(nombre, apellido, direccion, dpi);
                //3. Insertar en la DB la carrera
                informacionDao.guardarIndividual(individual);
            
      out.write("\n");
      out.write("        <div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                El cliente fue agregado correctamente<a href=\"ListaClienteIndividual.jsp\" class=\"alert-link\">Ver reporte de clientes</a>. \n");
      out.write("            </div>\n");
      out.write("        ");

         }
      out.write("\n");
      out.write("         <form action=\"MenuPrincipal.jsp\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-secondary\">Regresar Menu</button>\n");
      out.write("        </form>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
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
