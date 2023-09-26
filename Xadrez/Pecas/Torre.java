package Pecas;

import Tabuleiro.tabuleiro;
import Xadrez.Color;
import Xadrez.PecaXadrez;

public class Torre extends PecaXadrez {
    public Torre(tabuleiro tabu, Color cor){
        super(tabu, cor);
    }

    @Override
    public String toString() {
        return "T";
    }
}
