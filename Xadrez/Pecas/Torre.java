package Pecas;

import Tabuleiro.Posicao;
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

    @Override
    public boolean[][] MovimentosPossiveis() {
       boolean vet[][] = new boolean[getTabu().getLinhas()][getTabu().getColunas()];

        Posicao p = new Posicao(0, 0);

        //Pra cima
        p.setValores(pos.getLinha()-1,pos.getColuna());
        while(getTabu().posicaoExiste(p) && !getTabu().isPeca(p)){
            vet[p.getLinha()][p.getColuna()] = true;
            p.setLinha(p.getLinha()-1);
        }
        if(getTabu().posicaoExiste(p) && temPecaDoOponente(p)){
            vet[p.getLinha()][p.getColuna()] = true;
        }

        //Pra a esquerda
        p.setValores(pos.getLinha(),pos.getColuna()-1);
        while(getTabu().posicaoExiste(p) && !getTabu().isPeca(p)){
            vet[p.getLinha()][p.getColuna()] = true;
            p.setColuna(p.getColuna()-1);
        }
        if(getTabu().posicaoExiste(p) && temPecaDoOponente(p)){
            vet[p.getLinha()][p.getColuna()] = true;
        }

        //Pra a direita
        p.setValores(pos.getLinha(),pos.getColuna()+1);
        while(getTabu().posicaoExiste(p) && !getTabu().isPeca(p)){
            vet[p.getLinha()][p.getColuna()] = true;
            p.setColuna(p.getColuna()+1);
        }
        if(getTabu().posicaoExiste(p) && temPecaDoOponente(p)){
            vet[p.getLinha()][p.getColuna()] = true;
        }

       return vet;
    }

}
