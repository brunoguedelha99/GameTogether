package gametogether;

public class Jogador {
    String nome;
    int idade;
    String morada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", idade=" + idade + ", morada=" + morada + '}';
    }
    
    
}
