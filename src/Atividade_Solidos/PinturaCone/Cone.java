package Atividade_Solidos.PinturaCone;

public class Cone {
    private double Raio;
    private double Altura;
    private Tinta tinta;
    private int Tipotinta;

    public Cone(double Raio, double Altura) {
        this.Raio = Raio;
        this.Altura = Altura;
    }

    public Cone(double Raio, double Altura,  Tinta tinta) {
        setRaio(Raio);
        setAltura(Altura);
        setTinta(tinta);
    }

    public Cone(double Raio, double Altura,  int TipoTinta) {
        setRaio(Raio);
        setAltura(Altura);
        setTitpotinta(TipoTinta);
    }

    public double getRaio() {
        return Raio;
    }

    public void setRaio(double raio) {
        if(raio > 0)
            Raio = raio;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        if(altura > 0)
            Altura = altura;
    }

    public Tinta getTinta() {
        return tinta;
    }

    public void setTinta(Tinta Tinta) {
        tinta = Tinta;
    }

    public double getTitpotinta() {
        return Tipotinta;
    }

    public void setTitpotinta(int tipoTinta) {
        if(tipoTinta >= 1 && tipoTinta <= 3){
            Tipotinta = tipoTinta;
            Tinta tn = new Tinta(tipoTinta, AreaTotalCone());
            setTinta(tn);
        }
    }

    public double RetornaRaioQuadrado(){
        return Math.pow(getRaio(), 2);
    }

    public double GeratrizQuadrada(){
        return Math.pow(getRaio(), 2) + Math.pow(getAltura(), 2);
    }

    public double Geratriz(){
        return Math.sqrt(GeratrizQuadrada());
    }

    public double AreaLateral(){
        return 3.14 * getRaio() * Geratriz();
    }

    public double AreaDoFundo(){
        return 3.14 * RetornaRaioQuadrado();
    }

    public double AreaTotalCone(){
        return AreaDoFundo() + AreaLateral();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("- Cone");
        str.append("\n");
        str.append("Raio: ").append(Raio);
        str.append("\n");
        str.append("Altura: ").append(Altura);
        str.append("\n");
        str.append("Nivel: ").append(Tipotinta);
        str.append("\n");
        str.append("—————————-");
        str.append("\n");
        str.append("Geratriz:  ").append(Geratriz());
        str.append("\n");
        str.append("—————————-");
        str.append("\n");
        str.append("Área do Fundo: ").append(String.format("%.2f", AreaDoFundo()));
        str.append("\n");
        str.append("Área Lateral Cone: ").append(String.format("%.1f", AreaLateral()));
        str.append("\n");
        str.append("Área Total: ").append(String.format("%.2f", AreaTotalCone()));
        str.append("\n");
        str.append("—————————-");
        str.append("\n");
        str.append("Litros: ").append(String.format("%.3f", getTinta().retornaQuantidadeLitros()));
        str.append("\n");
        str.append("Latas: ").append(getTinta().retornaQuantidadeLatas());
        str.append("\n");
        str.append("—————————-");
        str.append("\n");
        str.append("Preço Total: ").append(String.format("%.1f", getTinta().CalculaPreco()));
        return str.toString();
    }
}
