package Cardapio;

public class Cardapio {

    private int codigo;
    private int quantidade;
    private double subtotal;
    private double totalGeral = 0;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setSubtotal(double preco) {
        subtotal = preco * quantidade;
        totalGeral += subtotal;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotalGeral() {
        return totalGeral;
    }

    public void mostrarMenu() {
        StringBuilder str = new StringBuilder();

        str.append("---------- Cardápio ----------");
        str.append("\n");
        str.append("100 - Cachorro Quente  R$ 1,20");
        str.append("\n");
        str.append("101 - Bauru Simples    R$ 1,30");
        str.append("\n");
        str.append("102 - Bauru com Ovo    R$ 1,50");
        str.append("\n");
        str.append("103 - Hambúrguer       R$ 1,20");
        str.append("\n");
        str.append("104 - Cheeseburguer    R$ 1,30");
        str.append("\n");
        str.append("105 - Refrigerante     R$ 1,00");
        str.append("------------------------------");
    }

    public double obterPreco() {
        switch (getCodigo()) {
            case 100: return 1.20;
            case 101: return 1.30;
            case 102: return 1.50;
            case 103: return 1.20;
            case 104: return 1.30;
            case 105: return 1.00;
            default: return -1;
        }
    }

}
