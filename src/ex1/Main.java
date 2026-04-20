package ex1;

public class Main {
    public static void main(String[] args) {
        Player jogador = new Player();
        jogador.receberDano(2.0);
        System.out.println("Vida depois de receber dano: " + jogador.getVida());
    }
}