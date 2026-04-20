package ex4;

public class Main {
    static void main(String[] args) {
        Player player = new Player("Ytalo", 20.0);
        Inimigo capeta = new Inimigo("Capeta", 35.0);

        player.saudacao();
        capeta.saudacao();

        player.receberDano(capeta.atacar());

        System.out.println("Vida atual do jogador: " + player.getVida());
    }
}
