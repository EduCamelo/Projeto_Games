package Xadrez;
import Tabuleiro.Peca;
import Tabuleiro.tabuleiro;

public class PecaXadrez extends Peca{
    private Color cor;

    public PecaXadrez(tabuleiro tabu,Color cor) {
        super(tabu);
        this.cor = cor;
    }

    public Color getCor() {
        return cor;
    }
}
