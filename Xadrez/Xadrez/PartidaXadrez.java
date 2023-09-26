package Xadrez;
import Pecas.Rei;
import Pecas.Torre;
import Tabuleiro.Peca;
import Tabuleiro.Posicao;
import Tabuleiro.tabuleiro;
public class PartidaXadrez {
    private static tabuleiro tabu;
    
    public PartidaXadrez(){
        tabu = new tabuleiro(8,8);
        InicioDoGame();
    }

    public PecaXadrez[][] getPecas(){
        PecaXadrez[][] aux = new PecaXadrez[tabu.getLinhas()][tabu.getColunas()];
        for (int i = 0; i < tabu.getLinhas(); i++) {
            for (int j = 0; j < tabu.getColunas(); j++) {
                aux[i][j] = (PecaXadrez)tabu.peca(i, j);
            }
        }
        return aux;
    }

    public static PecaXadrez relizarJogada(XadrezPosicao PosicaoInicial, XadrezPosicao PosicaoAlvo){
       Posicao inicial = PosicaoInicial.toPosicao();
       Posicao alvo = PosicaoAlvo.toPosicao();
       validacaoPosicaoInicial(inicial);
       Peca PecaCapturada = relizarMovimento(inicial, alvo);
       return (PecaXadrez) PecaCapturada;
    }

    private static Peca relizarMovimento(Posicao inicial, Posicao alvo) {
        Peca p = tabu.removerPeca(inicial);
        Peca PecaCapturada = tabu.removerPeca(alvo);
        tabu.ColocarPeca(p, alvo);
        return PecaCapturada;
    }

    private static void validacaoPosicaoInicial(Posicao inicial) {
        if(!tabu.isPeca(inicial)){
            throw new XadrezException("Não tem peça para mover");
        }
    }

    private void ColocarNovaPeca(char coluna, int linha, PecaXadrez peca){
        tabu.ColocarPeca(peca, new XadrezPosicao(coluna, linha).toPosicao());
    }

    private void InicioDoGame(){
        ColocarNovaPeca('a',1,new Torre(tabu,Color.Branco));
        ColocarNovaPeca('e',8,new Rei(tabu,Color.Preto));
    }
}
