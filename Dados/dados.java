import java.security.SecureRandom;
import java.util.Scanner;

public class dados {

    public static int sorteiaFace(int dado) {
        int num;
        SecureRandom random = new SecureRandom();
        num = random.nextInt(dado);
        return num;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de faces do dado: ");
        int x = input.nextInt();
        if (x <= 1) {
            System.out.println("O dado tem que ser maior que 1, escolha outro número");
            do {
                System.out.print("Digite a quantidade de faces do dado: ");
                x = input.nextInt();
                if (x <= 1) {
                    System.out.println("O dado tem que ser maior que 1, escolha outro número");
                    
                }
            } while (x <= 1);
        }
        System.out.print("Digite a quantidade de dados: ");
        int y = input.nextInt();
        if (y <= 0) {
            System.out.println("A quantidade de dados tem que ser maior que 0, escolha outro número");
            do {
                System.out.print("Digite a quantidade de dados: ");
                y = input.nextInt();
                if (y <= 0) {
                    System.out.println("A quantidade de dados tem que ser maior que 0, escolha outro número");
                }
            } while (y <= 0);
        }
        int[] z = new int[y];
        for (int i = 0; i < y; i++) {
            z[i] = sorteiaFace(x) + 1;
            System.out.println("O " + (i + 1) + "° número sortiado foi: " + z[i]);
        }

        input.close();
    }
}