package Xadrez;
import Tabuleiro.Peca;
import Tabuleiro.Posicao;
import Tabuleiro.tabuleiro;

public abstract class PecaXadrez extends Peca{
    private Color cor;

    public PecaXadrez(tabuleiro tabu,Color cor) {
        super(tabu);
        this.cor = cor;
    }

    public Color getCor() {
        return cor;
    }

    protected boolean temPecaDoOponente(Posicao pos){
        PecaXadrez p = (PecaXadrez)getTabu().peca(pos);
        return p != null && p.getCor() != cor;
    }

}
