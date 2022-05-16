import java.util.Scanner;

public class programaPrincipal {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha a opção desejada:");
        System.out.println("1. Criar nova tarefa");
        System.out.println("2. Marcar tarefa como concluida");
        System.out.println("3. Excluir tarefa");
        int opcao = input.nextInt();
        String nomeTarefa;
        int qtdTarefas=0;
        switch (opcao){
            case 1:
                System.out.println("Qual o nome da tarefa?");
                nomeTarefa = input.nextLine();
                qtdTarefas++;
                break;
            case 2:
                System.out.println("Qual tarefa concluir?");
                break;
            case 3:
                System.out.println("Qual tarefa excluir?");
                break;
                        }
        System.out.println("Lista de tarefas:");
        System.out.println(qtdTarefas);

    }
}
