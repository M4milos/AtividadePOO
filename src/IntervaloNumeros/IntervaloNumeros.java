package IntervaloNumeros;

public class IntervaloNumeros {
    public int num1;
    public int num2;

    public IntervaloNumeros() {
    	
    }
    
    public IntervaloNumeros(int num1, int num2) {
    	setNum1(num1);
    	setNum2(num2);
    }
    
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

    public String getIntervalos() {
        StringBuilder sb = new StringBuilder();

        for (int i = getNum1(); i <= getNum2(); i++) {
            sb.append(i).append(" ");
        }

        return sb.toString().trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Os números digitados foram: ");
        sb.append(num1);
        sb.append(" e ");
        sb.append(num2);
        sb.append("\n");
        sb.append("Os números do intervalo dos dois números são: ");
        sb.append(getIntervalos());
        return sb.toString();
    }
}
