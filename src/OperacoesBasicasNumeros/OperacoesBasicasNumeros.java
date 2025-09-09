package OperacoesBasicasNumeros;

public class OperacoesBasicasNumeros {
    public int num1;
    public int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int Soma(){
        return  num1 + num2;
    }

    public int Subtracao(){
        return num1 - num2;
    }

    public int Multiplicacao(){
        return num1 * num2;
    }

    public int Divisao(){
        return num1 / num2;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Aqui estão as operações básicas dos números: ").append(getNum1()).append(" e ").append(num2).append("\n");
        str.append("Soma: ").append(Soma()).append("\n");
        str.append("Subtracao: ").append(Subtracao()).append("\n");
        str.append("Multiplicacao: ").append(Multiplicacao()).append("\n");
        str.append("Divisao: ").append(Divisao()).append("\n");
        return str.toString();
    }
}
