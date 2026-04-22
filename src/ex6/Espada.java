package ex6;

public class Espada extends ItemCustom{
    public Espada(String nome, String raridade, double durabilidade){
        super(nome, durabilidade, raridade);
    }

    public void saudacao(){
        System.out.println("Ola! sou a " + getName() + " e tenho " + getDurabilidade() + " de durabilidade.");
    }

}