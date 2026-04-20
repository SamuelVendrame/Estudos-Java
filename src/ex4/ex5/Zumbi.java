package ex4.ex5;

import ex4.EntidadeBase;
import ex4.Inimigo;

public class Zumbi extends Inimigo {
    public Zumbi(String nome, double dano){
        super(nome, dano);
    }

    @Override
    public double atacar(){
        double danoZumbi = this.getDano() + 5.00;
        System.out.println("Oh nao! voce esta sendo atacado por um Zumbi. Ele tem dano adicional: " + danoZumbi);
        return danoZumbi;
    }

}
