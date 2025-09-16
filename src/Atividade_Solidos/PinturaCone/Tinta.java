package Atividade_Solidos.PinturaCone;

public class Tinta {

    private int TipoTinta;
    private final double Rendimento = 3.45;
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

    public double getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(double quantidade) {
        Quantidade = quantidade;
    }

    public double retornaQuantidadeLitros(){
        return getQuantidade() * Rendimento;
    }

    public double retornaQuantidadeLatas(){
        return Math.round(retornaQuantidadeLitros() / Lata);
    }

    public double CalculaPreco(){
        switch (TipoTinta){
            case 1:
                return 238.90 * retornaQuantidadeLatas();
            case 2:
                return 467.98 * retornaQuantidadeLatas();
            case 3:
                return 758.34 * retornaQuantidadeLatas();
        }
        return 0;
    }

    public Tinta(int tipoTinta, double quant) {
        setTipoTinta(tipoTinta);
        setQuantidade(quant);
    }

    public static String RetornaTiposDaTinta(){
        StringBuilder str = new StringBuilder();
        str.append("---- Opções de Tintas ----");
        str.append("\n");
        str.append("• Tipo 1 – R$ 238,90");
        str.append("\n");
        str.append("• Tipo 2 – R$ 467,98");
        str.append("\n");
        str.append("• Tipo 3 – R$ 758,34");
        str.append("\n");
        return str.toString();
    }

}
