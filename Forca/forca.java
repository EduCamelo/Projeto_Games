import java.util.Scanner;

public class forca {

    public static boolean verificar(String teste) {
        char y = teste.charAt(0);
        if (!Character.isLetter(y) || teste.length() != 1) {
            return false;
        }
        return true;
    }

    public static char[] trocar(char[] dople, String teste, char[] espantalho) {
        char y = teste.charAt(0);
        for (int i = 0; i < dople.length; i++) {
            if (dople[i] == y) {
                espantalho[i] = y;
            }
        }
        return espantalho;
    }

    public static boolean fim(char[] espantalho) {
        
        for(int i = 0; i < espantalho.length; i++){
            if(espantalho[i] == '_'){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palavra = new String ("albedo"), teste;
        char[] dople = palavra.toCharArray(), espantalho = new char[dople.length];
        int a = 0;
        for (int i = 0; i < dople.length; i++) {
            espantalho[i] = '_';
        }

        do {
            System.out.println(espantalho);
            System.out.print("Digite uma LETRA para tentar descobrir a palavra: ");
            teste = input.next();
            if (!verificar(teste)) {
                System.out.println("por favor, digite apenas letras.");
            }
            else if(fim(espantalho)){
                a++;
            }
            
            else{
                espantalho = trocar(dople, teste, espantalho);
            }
        } while (a == 0);
        
            System.out.println("A palavra era: " + palavra);
        input.close();
    }
}