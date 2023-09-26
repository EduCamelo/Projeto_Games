import java.util.Scanner;

public class lista {

    public static void menu(int numTarefas) {
        System.out.println("\nBem vindo a sua lista de tarefas!");
        System.out.println("1 - Adicionar tarefa na lista");
        System.out.println("2 - Alterar tarefa da lista");
        System.out.println("3 - Mudar a hora da tarefa da lista");
        System.out.println("4 - Concluir uma tarefa da lista");
        System.out.println("5 - Exibir tarefas");
        System.out.println("6 - Encerrar o programa");
        System.out.println("");
        System.out.println("Quantidade de tarefas na lista: " + numTarefas + "/5");
        System.out.print("Digite uma opção: ");
    }

    public static String addTarefa(Scanner input) {
        System.out.print("Digite a tarefa: ");
        String tarefa = input.nextLine();
        return tarefa;
    }

    public static int addHoras(Scanner input) {
        System.out.print("Digite as horas: ");
        int hora = input.nextInt();
        input.nextLine();
        return hora;
    }

    public static int addMin(Scanner input) {
        System.out.print("Digite os minutos: ");
        int min = input.nextInt();
        input.nextLine();
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z = 0, aux = 0, numTarefas = 0;
        String[] tarefas = new String[6];
        int[] horas = new int[6];
        int[] min = new int[6];
        boolean[] sit = new boolean[6];
        do {
            menu(numTarefas);
            y = input.nextInt();
            input.nextLine();
            System.out.println("");
            switch (y) {
                case 1:
                    if (numTarefas != 6) {
                        tarefas[numTarefas] = addTarefa(input);
                        horas[numTarefas] = addHoras(input);
                        min[numTarefas] = addMin(input);
                        numTarefas++;
                        System.out.println("Cadastro feito!");
                    } else {
                        System.out.println("A lista está cheia'");
                    }
                    break;
                case 2:
                    System.out.print("Digite o número da tarefa que quer mudar: ");
                    x = input.nextInt();
                    input.nextLine();
                    if (x >= 0 && x < 6) {
                        tarefas[x - 1] = addTarefa(input);
                        System.out.println("Alterado com sucesso!");
                    } else {
                        System.out.println("Número não encontrado");
                    }
                    break;
                case 3:
                    System.out.print("Digite o número da tarefa que quer mudar: ");
                    x = input.nextInt();
                    input.nextLine();
                    if (x >= 0 && x < 6) {
                        horas[x - 1] = addHoras(input);
                        min[x - 1] = addMin(input);
                        System.out.println("Alterado com sucesso!");
                    } else {
                        System.out.println("Número não encontrado");
                    }
                    break;

                case 4:
                    System.out.print("Digite o número da tarefa que completou: ");
                    x = input.nextInt();
                    input.nextLine();
                    if (x >= 0 && x < 6) {
                        sit[x - 1] = true;
                        System.out.println("Alterado com sucesso!");
                    } else {
                        System.out.println("Número não encontrado");
                    }
                    break;

                case 5:
                    for (int i = 0; i < numTarefas; i++) {
                        System.out.println((i + 1) + " - " + tarefas[i] + ": \n" + horas[i] + " horas e " + min[i]
                                + " minutos\n" + "situação: " + sit[i]);
                        if (sit[i] == true) {
                            z++;
                        }
                    }
                    if (numTarefas != 0) {
                        System.out.println("\nQuantidade de tarefas concluidas: " + z + "/" + numTarefas);
                    }
                    break;

                case 6:
                    aux++;
                    break;
            }
        } while (aux == 0);
        input.close();
        System.out.println("Programa encerrado");
    }
}