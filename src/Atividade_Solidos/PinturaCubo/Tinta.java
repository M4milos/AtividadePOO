package Atividade_Solidos.PinturaCubo;

public class Tinta {

    private int TipoTinta;
    private double Rendimento;
    private double Quantidade;
    private final double Lata = 18;

    public int getTipoTinta() {
        return TipoTinta;
    }

    public void setTipoTinta(int tipoTinta) {
        TipoTinta = tipoTinta;
    }

    public double getRendimento() {
        return Rendimento * getQuantidade();
    }

    public void setRendimento(double rendimento) {
        Rendimento = rendimento;
    }

    public double getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(double quantidade) {
        Quantidade = quantidade;
    }

    public double retornaQuantidadeLitros(){
        return getQuantidade() / Rendimento;
    }

    public double retornaQuantidadeLatas(){
        return Math.round(retornaQuantidadeLitros() / Lata);
    }

    public double CalculaPreco(){
        switch (TipoTinta){
            case 1:
                return 101.90 * retornaQuantidadeLatas();
            case 2:
                return 212.45 * retornaQuantidadeLatas();
            case 3:
                return 345.56 * retornaQuantidadeLatas();
        }
        return 0;
    }

    public Tinta(int tipoTinta, double rendimento, double quant) {
        setTipoTinta(tipoTinta);
        setRendimento(rendimento);
        setQuantidade(quant);
    }

    public static String RetornaTiposDaTinta(){
        StringBuilder str = new StringBuilder();
        str.append("---- Opções de Tintas ----");
        str.append("\n");
        str.append("• Tipo 1 – R$ 101,90");
        str.append("\n");
        str.append("• Tipo 2 – R$ 212,45");
        str.append("\n");
        str.append("• Tipo 3 – R$ 345,56");
        str.append("\n");
        return str.toString();
    }

}
