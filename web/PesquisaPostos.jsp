<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Suporte_Combustivel_.Tabela_Combustivel_" %>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisa Postos</title>
    </head>
    <body>
        <%
            try{
                
                out.print(new Tabela_Combustivel_().Lista_Postos());
                
            }catch (Exception e){
                out.println("Erro encontrado: " + e.getMessage());
            }
            
        %>
    </body>
</html>
