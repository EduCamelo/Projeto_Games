package Tabuleiro;

public class Peca {
    //Era essa peça que você queria?
    
    protected Posicao pos;
    private tabuleiro tabu;

    public Peca(tabuleiro tabu) {
        this.tabu = tabu;
    }
    
     protected tabuleiro getTabu() {
        return tabu;
    }

}
