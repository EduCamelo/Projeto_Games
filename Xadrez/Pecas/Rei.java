package Pecas;

import Tabuleiro.tabuleiro;
import Xadrez.Color;
import Xadrez.PecaXadrez;

public class Rei extends PecaXadrez {

    public Rei(tabuleiro tabu, Color cor) {
        super(tabu, cor);
    }
    
    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] MovimentosPossiveis() {
       boolean vet[][] = new boolean[getTabu().getLinhas()][getTabu().getColunas()];
       return vet;
    }
}
