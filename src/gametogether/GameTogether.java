
package gametogether;

import java.util.ArrayList;

//teste
public class GameTogether {


    public static void main(String[] args) {

        ArrayList<Jogador> jogadores= new ArrayList();
        Jogador Bruno = new Jogador("Bruno",22,"Lisboa","bruno@gmail.com","pass");
        Jogador Diogo = new Jogador("Diogo",22,"Lisboa","email","pass");
        
        Jogo ABC =new Jogo("Futebol","Lisboa","19:00","1/12/22",jogadores);
        ABC.add(Bruno);
        ABC.add(Diogo);
        
        System.out.println(ABC.toString());
    }
    
}
