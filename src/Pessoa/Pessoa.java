package Pessoa;

public class Pessoa {
    private int Idade;
    private String Nome;
    private double Peso;
    private double Altura;

    public Pessoa() {
    	
    }
    
    public Pessoa(int idade, String nome, double peso, double altura) {
    	setIdade(idade);
    	setNome(nome);
    	setPeso(peso);
    	setAltura(altura);
    }
    
    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public void Envelhecer(){
        if(getIdade() < 21){
            setAltura(getIdade() + 0.5);
        }
        setIdade(getIdade() + 1);
    }

    public void Engordar(double pesoEngordado){
        setPeso(getPeso() + pesoEngordado);
    }

    public void Emagrecer(double pesoEmagrecido){
        setPeso(getPeso() - pesoEmagrecido);
    }

    public void Crescer(double alturaCrescida){
        setAltura(getAltura() + alturaCrescida);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("--- A pessoa definda ficou ---");
        str.append("\n");
        str.append("Nome: ");
        str.append(Nome);
        str.append("\n");
        str.append("Idade: ");
        str.append(Idade);
        str.append("\n");
        str.append("Peso: ");
        str.append(Peso);
        str.append("\n");
        str.append("Altura: ");
        str.append(Altura);
        return str.toString();
    }
}
