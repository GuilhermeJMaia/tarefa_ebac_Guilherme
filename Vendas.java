package Tarefa;

public class Vendas {

    private String Suplemento;

    private int Codigo;

    private int Quantidade;

    public String getSuplemento() {
        return Suplemento;
    }

    public void setSuplemento(String suplemento) {
        Suplemento = suplemento;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public String nomeDoSuplemento(){
        return "Whey Protein";
    }

    public int Quantidade(){
        return 2;
    }
    public int codigoDoProduto(){
        return 202326;
    }
}
