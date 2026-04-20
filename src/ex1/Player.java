package ex1;

public class Player {
    public String name;
    public double health = 20.0;


    public double receberDano(double dano){
        System.out.println("Vida atual do jogador: " + health);
        return this.health = health - dano;
    }
}
