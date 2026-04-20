package ex4;

public class Player extends EntidadeBase{
    public Player(String nome, double vida){
        super(nome, vida);
    }

    public void saudacao(){
        System.out.println("Ola! Sou o seu jogador. Como podemos comecar a aventura?");
    }

}
