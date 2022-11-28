package gametogether;

import java.util.ArrayList;
import java.util.Date;

public class Jogo {
    private String nome;
    private String local;
    private String HoraDeJogo;
    private Date DataDeJogo;
    private ArrayList<Jogador> jogadores;

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

    public Date getDataDeJogo() {
        return DataDeJogo;
    }

    public void setDataDeJogo(Date DataDeJogo) {
        this.DataDeJogo = DataDeJogo;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void add(Jogador player){
        jogadores.add(player);
    }
     
}
