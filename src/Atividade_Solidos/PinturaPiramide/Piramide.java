package Atividade_Solidos.PinturaPiramide;

public class Piramide {

    private double Aresta;
    private double Altura;
    private Tinta tinta;
    private int TipoTinta;

    public Piramide(double Aresta, double Altura, int TipoTinta) {
        setAresta(Aresta);
        setAltura(Altura);
        setTipoTinta(TipoTinta);
    }

    public double getAresta() {
        return Aresta;
    }

    public void setAresta(double aresta) {
        Aresta = aresta;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public int getTipoTinta() {
        return TipoTinta;
    }

    public void setTipoTinta(int tipoTinta) {
        if(tipoTinta >= 1 && tipoTinta <= 3){
            TipoTinta = tipoTinta;
            Atividade_Solidos.PinturaPiramide.Tinta tn = new Atividade_Solidos.PinturaPiramide.Tinta(tipoTinta, RetornaAreaTotal());
            setTinta(tn);
        }
    }

    public Tinta getTinta() {
        return tinta;
    }

    public void setTinta(Tinta tinta) {
        this.tinta = tinta;
    }

    public double RetornaApotema() {
        return Math.sqrt((getAltura() * getAltura()) + (getAresta() * (getAresta())));
    }

    public double RetornaAreaBase() {
        return Math.pow(2 * getAresta(), 2);
    }

    public double RetornaAreaTriangulo() {
        double apotema = RetornaApotema();
        return (getAresta() * apotema);
    }

    public double RetornaAreaTotal() {
        return RetornaAreaBase() + (4 * RetornaAreaTriangulo());
    }

    public double RetornaVolume() {
        return (RetornaAreaBase() * getAltura()) / 3;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("ab: ").append(getAresta());
        str.append("\n");
        str.append("h: ").append(getAltura());
        str.append("\n");
        str.append("a1: ").append(RetornaApotema());
        str.append("\n");
        str.append("Área Triângulo: ").append(RetornaAreaTriangulo());
        str.append("\n");
        str.append("Área total: ").append(RetornaAreaTotal());
        str.append("\n");
        str.append("Tipo Tinta: ").append(getTipoTinta());
        str.append("\n");
        str.append("Litros: ").append(getTinta().retornaQuantidadeLitros());
        str.append("\n");
        str.append("Latas: ").append(getTinta().retornaQuantidadeLatas());
        str.append("\n");
        str.append("Preço: ").append(getTinta().CalculaPreco());
        str.append("\n");
        str.append("Volume: ").append(RetornaVolume());
        return str.toString();
    }
}


