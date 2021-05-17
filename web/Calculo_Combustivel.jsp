<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Suporte_Combustivel_.Tabela_Combustivel_"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculo Combustivel</title>
    </head>
    <body>
        <%
            try{
                // declarando as variáveis
                String valor_txt,alcool_txt, gasolina_txt;
                float valor, gasolina, alcool, calcCombus, consumo;

                // capturar peso e altura
                valor_txt = request.getParameter("dinheiro");
                alcool_txt = request.getParameter("alcool");
                gasolina_txt = request.getParameter("gasolina");
                
                // converção
                valor = Float.parseFloat(valor_txt);
                alcool = Float.parseFloat(alcool_txt);
                gasolina = Float.parseFloat(gasolina_txt);
                
                // calculo
                calcCombus = alcool/gasolina;
                
                //out.print(new Tabela_Combustivel().CalcCombustivel(alcool, gasolina));

                //desvio condicional
                if (calcCombus > 0.70){
                    out.println("Abasteça com Gasolina."+"<br>");
                    consumo = valor/gasolina;
                    out.println("Com "+valor+" Reais, você consegue abastecer: "+consumo+" litros");
                    
                }else{
                    System.out.println("Abasteça com Álcool.");
                    consumo = valor/alcool;
                    
                    out.println("com "+valor+" Reais, você consegue abastecer: "+consumo+" litros");
                }
                
            }catch (Exception e){
                out.println("Erro encontrado: " + e.getMessage());
            }
            
        %>
    </body>
</html>
