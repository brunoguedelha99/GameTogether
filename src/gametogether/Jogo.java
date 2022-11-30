package gametogether;

import java.util.ArrayList;

public class Jogo {
    private String nome;
    private String local;
    private String HoraDeJogo;
    private String DataDeJogo;
    private ArrayList<Jogador> jogadores;

    public Jogo(String nome, String local, String HoraDeJogo, String DataDeJogo, ArrayList<Jogador> jogadores) {
        this.nome = nome;
        this.local = local;
        this.HoraDeJogo = HoraDeJogo;
        this.DataDeJogo = DataDeJogo;
        this.jogadores = jogadores;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHoraDeJogo() {
        return HoraDeJogo;
    }

    public void setHoraDeJogo(String HoraDeJogo) {
        this.HoraDeJogo = HoraDeJogo;
    }

    public String getDataDeJogo() {
        return DataDeJogo;
    }
    
    public void setDataDeJogo(String DataDeJogo) {
        this.DataDeJogo = DataDeJogo;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void add(Jogador player){
        jogadores.add(player);
    }

    @Override
    public String toString() {
        return "Jogo{" + "nome=" + nome + ", local=" + local + ", HoraDeJogo=" + HoraDeJogo + ", DataDeJogo=" + DataDeJogo + ", jogadores=" + jogadores + '}';
    }
     
}
