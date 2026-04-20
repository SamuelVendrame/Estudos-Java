package ex1;

public class Player {
    private String name;
    private double health = 20.0;

    public double receberDano(double dano){
        System.out.println("Vida atual do jogador: " + health);
        return this.health = health - dano;
    }

    public String getName() {
        return name;
    }

    public double getVida(){
        return health;
    }

    public double setVida(double healthGiven){
        if(this.health <= 0){
            this.health = 0;
            System.out.println("Player com 0 de vida!");
            return health;
        }
        return this.health = healthGiven;
    }
}
