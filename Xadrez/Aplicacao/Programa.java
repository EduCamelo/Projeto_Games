package Aplicacao;

import Xadrez.PartidaXadrez;
import Xadrez.PecaXadrez;
import Xadrez.XadrezException;
import Xadrez.XadrezPosicao;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PartidaXadrez partida = new PartidaXadrez();
        while (true) {
            try {
                UI.clearScreen();
                UI.printTabu(partida.getPecas());

                System.out.println();
                System.out.print("Inicio: ");
                XadrezPosicao inicio = UI.readXadrezPosicao(input);

                System.out.println();
                System.out.print("Alvo: ");
                XadrezPosicao alvo = UI.readXadrezPosicao(input);

                PecaXadrez PecaCapturada = PartidaXadrez.relizarJogada(inicio, alvo);
            } catch (XadrezException e) {
                System.out.println(e.getMessage());
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                input.nextLine();
            }
        }
    }
}