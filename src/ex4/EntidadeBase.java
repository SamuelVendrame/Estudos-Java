package ex4;

public class EntidadeBase {
    private String nome;
    private double vida;

    public EntidadeBase(){} // construtor no-arg pra servir como "base" caso chamado

    public EntidadeBase(String nome, Double vida){ // o que realmente dara os params do objeto caso instanciado com valores para tais
        this.nome = nome;
        this.vida = vida;
    }

    public double receberDano(double dano){
        System.out.println("Dano recebido: " + dano);
        return vida = vida - dano;
    }

    // ha getters para passar a info mas nao para setar os dados em outras classes, mas sim para pegar os dados, visto que em inimigo e player uso super() com params

    public double getVida(){ return this.vida;}
}
