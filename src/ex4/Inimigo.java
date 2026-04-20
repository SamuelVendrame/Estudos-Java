package ex4;

public class Inimigo extends EntidadeBase{
    double dano = 5.0;

    public Inimigo(String nome, Double vida){
        super(nome, vida);
    }

    public void saudacao(){
        System.out.println("Hahaha! Sou seu inimigo! te darei dano, jogador!");
    }

    public double atacar(){
        System.out.println("Dano inflingido: " + this.dano);
        return dano;
    }
}
