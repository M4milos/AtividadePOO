package Usuario;

public class Usuario {
    public String nome;
    public String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() >= 4)
            this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        if(sobrenome.length() >= 4)
            this.sobrenome = sobrenome;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Seu nome completo é: ").append(getNome()).append(" ").append(getSobrenome());
        return builder.toString();
    }

}
