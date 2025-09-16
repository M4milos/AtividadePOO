package Atividade_Solidos.PinturaCubo;

public class Cubo  {

    private double Aresta;
    private int TipoTinta;
    private double Rendimento;
    private Tinta tinta;

    private final int faces = 6;

    public Cubo(double aresta, int tipoTinta, double rendimento) {
        setAresta(aresta);
        setTipoTinta(tipoTinta);
        setRendimento(rendimento);
        setTinta();
    }

    public double getAresta() {
        return Aresta;
    }

    public void setAresta(double aresta) {
        if(aresta > 0)
            Aresta = aresta;
    }

    public double getRendimento() {
        return Rendimento;
    }

    public void setRendimento(double rendimento) {
        Rendimento = rendimento;
    }

    public int getTipoTinta() {
        return TipoTinta;
    }

    public void setTipoTinta(int tipoTinta) {
        if(tipoTinta >= 1 && tipoTinta <= 3)
            TipoTinta = tipoTinta;
    }

    public Tinta getTinta() {
        return tinta;
    }

    public void setTinta() {
        tinta = new Tinta(getTipoTinta(), getRendimento(), RetornaAreaTotal());
    }

    public double RetornaAreaDaBase(){
        return Math.pow(getAresta(), 2);
    }

    public double RetornaAreaTotal(){
        return faces * RetornaAreaDaBase();
    }

    public double RetornaVolume(){
        return Math.pow(getAresta(), 3);
    }

    public double RetornaDiagonal(){
        return getAresta() * Math.sqrt(3);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("- Cubo");
        str.append("\n");
        str.append("a : ").append(getAresta());
        str.append("\n");
        str.append("Rendimento: ").append(getRendimento());
        str.append("\n");
        str.append("Tipo de Tinta : ").append(getTipoTinta());
        str.append("\n");
        str.append("—————————-");
        str.append("\n");
        str.append("Área da base: ").append(RetornaAreaDaBase());
        str.append("\n");
        str.append("Área Total: ").append(RetornaAreaTotal());
        str.append("\n");
        str.append("Diagonal do Cubo: ").append(RetornaDiagonal());
        str.append("\n");
        str.append("Litros de Tinta: ").append(getTinta().retornaQuantidadeLitros());
        str.append("\n");
        str.append("Latas de Tinta: ").append(getTinta().retornaQuantidadeLatas());
        str.append("\n");
        str.append("Valor Total: ").append(getTinta().CalculaPreco());
        return str.toString();
    }
}
