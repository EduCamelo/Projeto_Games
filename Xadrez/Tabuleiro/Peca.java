package Tabuleiro;

public abstract class Peca {
    //Era essa peça que você queria?
    
    protected Posicao pos;
    private tabuleiro tabu;

    public Peca(tabuleiro tabu) {
        this.tabu = tabu;
    }
    
     protected tabuleiro getTabu() {
        return tabu;
    }

    public abstract boolean[][] MovimentosPossiveis();

    public boolean MovimentoPossivel(Posicao pos){
        return MovimentosPossiveis()[pos.getLinha()][pos.getColuna()];
    }

    public boolean travado(){
        boolean[][] vet = MovimentosPossiveis();

        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if(vet[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

}
