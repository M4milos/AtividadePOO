package Quadrado;

public class Quadrado {

    private int lado;

    public Quadrado() {
    	
    }
    
    public Quadrado(int lado) {
    	setLado(lado);
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        if(lado > 0)
            this.lado = lado;
    }

    public int area() {
        return lado * lado;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Lado do quadrado =");
        str.append(lado);
        str.append(", area()=");
        str.append(area());
        str.append("]");
        return str.toString();
    }
}