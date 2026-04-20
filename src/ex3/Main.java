package ex3;

import ex1.Player;

public class Main {
    public static void main(String[] args) {
        Inimigo enemy = new Inimigo("Capeta dos infernos", 50.0);
        Player player = new Player();

        enemy.atacar(player);
        System.out.printf("O monstro " + enemy.getNome() + " + atacou! - Vida do jogador apos ataque: " + player.getVida());
    }
}
