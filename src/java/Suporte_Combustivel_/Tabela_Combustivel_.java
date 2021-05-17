package Suporte_Combustivel_;

public class Tabela_Combustivel_ {
    String html ="";
    
    private void DifCombustivel(){
        html+="<p>Você fica com duvida sobre qual combustível abastecer para econômizar um pouco mais?</p>";
        html+="<div align=\"left\">";
        html+=" <table border=\"1\" cellpadding=\"10\" width=\"650\" cellspacing=\"2\">";
        html+="     <tr><td><b><div align=\"center\">Situação</b></td>                                                                           <td><b>Exemplo</b></td></tr>";
        html+="     <tr><td>Adicione em 'Valor' quanto pretende abastecer.</td>                                                 <td><b>50</b></td></tr>";
        html+="     <tr><td>Adicione em 'Preço do Alcool' o valor do alcool no posto que você costuma abastecer.</td>                            <td><b>3.4499</b></td></tr>"; 
        html+="     <tr><td>Adicione em 'Preço da Gasolina' o valor do gasolina no posto que você costuma abastecer.</td>                        <td><b>5.8999</b></td></tr>";       
        html+=" </table>";
        html+="</div>";
        html+="<p>Siga as instruções acima e acabe de vez com esse problema!</p>";
    }
    
    private void RespBusca(){
        html+="<p>Use o campo de busca para encontrar valores de outros postos!</p>";
        html+="<div align=\"center\">";
        html+=" <table border=\"1\" cellpadding=\"10\" width=\"150\" cellspacing=\"2\">";
        html+="     <tr><td><b><div align=\"center\">Exemplo</b></td></tr>";                                                                          
        html+="     <tr><td><div align=\"center\">Ipiranga</td></tr>";
        html+=" </table>";
        html+="</div>";
    }
    
    public String getDifCombustivel(){
        DifCombustivel();
        return html;
    }
    
    public String getRespBusca(){
        RespBusca();
        return html;
    }
    
    public String Lista_Postos(){
        
        String resultado ="Preços de Combustível em Postos de São Paulo:" + " ";
        String listaPostos[][]={
            {"Ipiranga:","Alcool: 3.8999","Gasolina: 5.8999"},
            {"Petrobras:","Alcool: 3.7899","Gasolina: 6.1999"},
            {"Ale:","Alcool: 3.4999","Gasolina: 5.7999"},
            {"São Luiz:","Alcool: 3.9999","Gasolina: 6.2999"},
            {"Shell:","Alcool: 3.1499","Gasolina: 5.5999"}
        };
        resultado += "<br>";
        for (int i=0; i<listaPostos.length;i++){
            resultado += "<br>";
            for (int n=0; n<listaPostos[i].length; n++){
                resultado += listaPostos[i][n] + "<br>";
            }
        }
        resultado += "<br><br>";
        return resultado;
    }
    
}
