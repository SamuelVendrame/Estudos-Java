package ex4.ex5;

import ex4.Inimigo;

public class Fantasma extends Inimigo {
    public Fantasma(String nome, double dano){
        super(nome, dano);
    }

    @Override
    public double atacar() {
        double danoFantasma = this.getDano() + (this.getDano() * 0.5);
        System.out.println("O fantasma esta te atacando! o dano dele tem um bonus de 0.5 no ataque.");
        return danoFantasma;
    }
}
