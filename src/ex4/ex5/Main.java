package ex4.ex5;

import ex4.EntidadeBase;
import ex4.Inimigo;
import ex4.Player;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Player player =  new Player("Ytalo", 20.0);

        System.out.println("Vida atual do jogador: " + player.getVida());

        List<Inimigo> inimigos = new ArrayList<>();
        inimigos.add(new Zumbi("Macielo", 5.00));
        inimigos.add(new Fantasma("Juan", 5.00));

        for(Inimigo monstro : inimigos) {
            player.receberDano(monstro.atacar());
        }

        System.out.println("Vida depois do dano (FINAL): " + player.getVida());
    }
}
