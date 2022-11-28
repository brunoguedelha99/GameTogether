package gametogether;

public class Jogador {
    String nome;
    int idade;
    String morada;
    String email;
    String password;

    public Jogador(String nome, int idade, String morada, String email, String password) {
        this.nome = nome;
        this.idade = idade;
        this.morada = morada;
        this.email = email;
        this.password = password;
    }

   
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
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", idade=" + idade + ", morada=" + morada + '}';
    }
    
    
}
