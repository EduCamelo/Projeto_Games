package Xadrez;

import Tabuleiro.tabuleiroException;

public class XadrezException extends tabuleiroException{
    private static final long serialVersionUID = 1L;

    public XadrezException(String msg){
        super(msg);
    }
}
