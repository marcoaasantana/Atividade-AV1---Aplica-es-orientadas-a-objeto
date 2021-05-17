<%@page import="Suporte_Combustivel_.Tabela_Postos"%>
<%@page import="Suporte_Combustivel_.Tabela_Combustivel_"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
    <head>
        <title>GUIA DE ABASTECIMENTO</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style type="text/css">
            @charset "utf-8";
            body{
                border-top: 30px;
                margin-top: -15px;
                padding: 0;
                text-align: center;
                background: url('../ProjetoAbastecimento_Versao_Final_1/background_abastecimento.jpg');
            }
            section#interface{
                background: greenyellow;
                margin: -3% auto;
                width: 780px;
                height: 720px;
                margin-left: auto;
                margin-right: auto;
            }
            section#interface h3{
                padding-top: 25px;
                font-size: 22pt;
                color: white;
                text-shadow: 1px 1px 1px #000000;
            }
            section#interface li{
                margin-left: 8px;
                color: black;
                display: inline-block;
                font-family: Helvetica, sans-serif;
                font-size: 11pt;
            }
            a#busca{
                font-size: 1px;
                margin-left: 40px;
            }
            footer{
                background-color: whitesmoke;
                display: inline-block;
            }
            ul li{
                padding-bottom: 5px;
                display: inline-block;
            }
            ul li#valor{
                margin-left: -83px;
            }
            ul li#alcool{
                margin-left: -86px;
            }
            ul li#gasolina{
                margin-left: -104px;
            }
            input#camp1{
                margin-left: -240px;
            }
            div#camp2{
                margin-left: 49px;
                margin-top: -21px;
            }
            div#camp3{
                margin-left: 290px;
                margin-top: -21px;
            }
        </style>
    </head>
    <body>
        <section id="interface">
            <h3>DESCUBRA COM QUAL COMBUSTÍVEL ABASTECER</h3>

            <li><%=new Tabela_Combustivel_().getDifCombustivel()%></li>
       
            <div>
                <form action="Calculo_Combustivel.jsp" method="get" target="result">
                    <ul>
                        <li id="valor">Valor em Reais : <input  type="text" name="dinheiro" size="6"/></li></br>
                        <li id="alcool">Preço do Alcool : <input type="text" name="alcool" size="6"/></li></br>
                        <li id="gasolina">Preço da Gasolina : <input type="text" name="gasolina" size="6"/></li></br>
                    </ul>
                    <input id="camp1" type="submit" name="enviar" value="Calcular Combustível" />
                </form>
            </div>
            <div id="camp2">
                <form action="PesquisaPostos.jsp" method="get" target="result">
                    <input type="submit" name="enviar" value="Buscar Postos" />
                </form>
            </div>
            <div id="camp3">
                <form action="PesquisaOleo.jsp" method="get" target="result">
                    <input type="submit" name="enviar" value="Troca de Óleo" />
                </form>
            </div>   
            <br><br>
            <footer>
                <iframe name="result" Width="380" Height="120"></iframe>
            </footer>
        </section>
        
    </body>
</html>
