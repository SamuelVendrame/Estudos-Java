package ex6;

public class Picareta extends ItemCustom{
    public Picareta(String nome, String raridade, double durabilidade){
        super(nome, durabilidade, raridade);
    }

    public void saudacao(){
        System.out.println("Ola! sou a " + getName() + " e tenho " + getDurabilidade() + " de durabilidade.");
    }

}
