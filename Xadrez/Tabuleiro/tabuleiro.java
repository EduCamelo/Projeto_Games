package Tabuleiro;

public class tabuleiro {
    private Peca[][] pecas;
    private int linhas;
    private int colunas;

    public tabuleiro(int linhas, int colunas) {
        if (linhas < 1 || colunas < 1) {
            throw new tabuleiroException("Erro 0: tem que ter pelo menos 1 posição de linha e coluna.");
        }
        this.colunas = colunas;
        this.linhas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public Peca peca(int linha, int coluna) {
        if (!posicaoExiste(linha, coluna)) {
            throw new tabuleiroException("Erro 1: não é uma posição do tabu.");
        }
        return pecas[linha][coluna];
    }

    public Peca peca(Posicao pos) {
        if (!posicaoExiste(pos)) {
            throw new tabuleiroException("Erro 1: não é uma posição do tabu.");
        }
        return pecas[pos.getLinha()][pos.getColuna()];
    }

    public void ColocarPeca(Peca peca, Posicao pos) {
        if (isPeca(pos)) {
            throw new tabuleiroException("Erro 2: Já tem uma peça nessa posição");
        }
        pecas[pos.getLinha()][pos.getColuna()] = peca;
        peca.pos = pos;
    }

    public Peca removerPeca(Posicao pos) {
        if (!posicaoExiste(pos)) {
            throw new tabuleiroException("Erro 1: não é uma posição do tabu.");
        } else if (peca(pos) == null) {
            return null;
        }
        Peca aux = peca(pos);
        aux.pos = null;
        pecas[pos.getLinha()][pos.getColuna()] = null;
        return aux;
    }

    private boolean posicaoExiste(int linha1, int coluna1) {
        return linha1 >= 0 && linha1 < this.getLinhas() && coluna1 >= 0 && coluna1 < this.getColunas();
    }

    public boolean posicaoExiste(Posicao pos) {
        return posicaoExiste(pos.getLinha(), pos.getColuna());
    }

    public boolean isPeca(Posicao pos) {
        if (!posicaoExiste(pos)) {
            throw new tabuleiroException("Erro 0: tem que ter pelo menos 1 posição de linha e coluna.");
        }
        return peca(pos) != null;
    }
}
