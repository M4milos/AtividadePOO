package Salario;

public class Salario {

    private double valorHora;
    private double salarioBruto;
    private int horasMes;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasMes() {
        return horasMes;
    }

    public void setHorasMes(int horasMes) {
        this.horasMes = horasMes;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    private void setSalarioBruto() {
        salarioBruto = valorHora * horasMes;
    }

    private double calcularIR() {
        return salarioBruto * 0.11;
    }

    private double calcularINSS() {
        return salarioBruto * 0.08;
    }

    private double calcularSindicato() {
        return salarioBruto * 0.05;
    }

    private double calcularTotalDescontos() {
        return calcularIR() + calcularINSS() + calcularSindicato();
    }

    private double calcularSalarioLiquido() {
        return salarioBruto - calcularTotalDescontos();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        setSalarioBruto();
        str.append("--- Demonstrativo de Salário ---\n");
        str.append("Salário bruto: R$ ").append(String.format("%.2f", getSalarioBruto())).append("\n");
        str.append("IR (11%): R$ ").append(String.format("%.2f", calcularIR())).append("\n");
        str.append("INSS (8%): R$ ").append(String.format("%.2f", calcularINSS())).append("\n");
        str.append("Sindicato (5%): R$ ").append(String.format("%.2f", calcularSindicato())).append("\n");
        str.append("Salário líquido: R$ ").append(String.format("%.2f", calcularSalarioLiquido())).append("\n");
        return str.toString();
    }
}
