package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Suporte_Combustivel_.Tabela_Postos;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public final class PesquisaOleo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Pesquisa Oleo</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

                
            List<Tabela_Postos> p = new ArrayList<Tabela_Postos>();
            
            p.add(new Tabela_Postos("Lubrax","Semi-Sintético","36,00 Reais","50,00 Reais"));
            p.add(new Tabela_Postos("Lubrax","Semi-Sintético","36,00 Reais","50,00 Reais"));
            p.add(new Tabela_Postos("Lubrax","Semi-Sintético","36,00 Reais","50,00 Reais"));
            p.add(new Tabela_Postos("Lubrax","Semi-Sintético","36,00 Reais","50,00 Reais"));
            p.add(new Tabela_Postos("Lubrax","Semi-Sintético","36,00 Reais","50,00 Reais"));
            p.add(new Tabela_Postos("Lubrax","Semi-Sintético","36,00 Reais","50,00 Reais"));
            p.add(new Tabela_Postos("Lubrax","Semi-Sintético","36,00 Reais","50,00 Reais"));
            
            for(Tabela_Postos valor: p){
                out.print("<br><br>");
                out.print("Nome: "+ valor.getMarca() + "<br>");
                out.print("Tipo: "+ valor.getTipo() + "<br>");
                out.print("Preço: "+ valor.getPreco() + "<br>");
                out.print("Valor de troca: "+ valor.getTroca() + "<br>");
            }
        
      out.write("  \n");
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
