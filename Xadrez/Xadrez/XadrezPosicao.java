package Xadrez;
import Tabuleiro.Posicao;

public class XadrezPosicao {
    private char coluna;
    private int linha;
    
    public XadrezPosicao(char coluna, int linha){
        if(coluna < 'a' || coluna > 'h' || linha < 1 || linha>8 ){
            throw new XadrezException("Erro 3: o tabuleiro só vai de A até G e de 1 até 8");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    public char getColuna() {
        return coluna;
    }

    public void setColuna(char coluna) {
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    protected Posicao toPosicao(){
        return new Posicao(8 - linha, coluna - 'a');
    }

    protected static XadrezPosicao ParaPosicao(Posicao pos){
        return new XadrezPosicao((char)('a' - pos.getColuna()), 8 - pos.getLinha());
    }

    @Override
    public String toString() {
        return ""+ coluna + linha;
    }
}
