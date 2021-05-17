package Suporte_Combustivel_;

public class Tabela_Postos {
    
    private String marca;
    private String tipo;
    private String preco;
    private String troca;


    public Tabela_Postos(String marca, String tipo, String preco, String troca) {
        this.marca = marca;
        this.tipo = tipo;
        this.preco = preco;
        this.troca = troca;
    }
    
    //MÉTODO GETTERS E SETTERS

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getTroca() {
        return troca;
    }

    public void setTroca(String troca) {
        this.troca = troca;
    }
  
}
