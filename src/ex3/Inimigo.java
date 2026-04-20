package ex3;


import ex1.Player;

public class Inimigo {
    private String nome;
    private double dano = 5.0;

    public Inimigo(String nome, Double dano){
        this.nome = nome;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void atacar(Player player){

        player.receberDano(this.dano);
        System.out.println("Atacando jogador! O ataque deu: " + dano + " de dano.");
    }
}
