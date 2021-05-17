<%@page import="Suporte_Combustivel_.Tabela_Postos"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisa Oleo</title>
    </head>
    <body>
        <%
            out.print("Pre�os de �leo lubrificante em Postos de S�o Paulo:"+"<br>");
                
            List<Tabela_Postos> p = new ArrayList<Tabela_Postos>();
            
            p.add(new Tabela_Postos("Lubrax","Semi-Sint�tico","36,00 Reais","50,00 Reais"));
            p.add(new Tabela_Postos("Castrol","Sint�tico","30,00 Reais","47,90, Reais"));
            p.add(new Tabela_Postos("Shell","Semi-Sint�tico","45,00 Reais","49,99 Reais"));
            p.add(new Tabela_Postos("Petronas","Sint�tico","39,00 Reais","48,00 Reais"));
            p.add(new Tabela_Postos("Ipiranga","Sint�tico","42,00 Reais","60,00 Reais"));

            
            for(Tabela_Postos valor: p){
                out.print("<br>");
                out.print("Nome: "+ valor.getMarca() + "<br>");
                out.print("Tipo: "+ valor.getTipo() + "<br>");
                out.print("Pre�o: "+ valor.getPreco() + "<br>");
                out.print("Valor de troca: "+ valor.getTroca() + "<br>");
            }
            
        %>  
    </body>
</html>
