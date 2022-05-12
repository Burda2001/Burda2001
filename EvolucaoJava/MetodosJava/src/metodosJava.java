import java.util.Scanner;
public class metodosJava {
        //Criação dos metodos
    public static void soma(int a,int b){
        int resultado = a + b;
        System.out.println("A SOMA DE A+B = "+ resultado);
    }
    public static void subtracao(int a,int b){
        int resultado = a - b;
        System.out.println("A SUBTRAÇÃO DE A+B = "+ resultado);
    }
    public static void divisao(int a,int b){
        int resultado = a / b;
        System.out.println("A DIVISÃO DE A+B = "+ resultado);
    }
    public static void multiplicacao(int a,int b){
        int resultado = a * b;
        System.out.println("A MULTIPLICAÇÃO DE A+B = "+ resultado);
    }
    // Função main, utilização dos métodos.
    public static void main(String[] args){
        //Scanner da escolha
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de qual operação você quer fazer: ");
        System.out.println("1.Soma 2.Subtração 3.Multiplicação 4.Divisão");
        int escolha = scanner.nextInt();

        //input dos valores
        System.out.println("Insira o primeiro número: ");
        int a = scanner.nextInt();
        System.out.println("Insira o segundo número: ");
        int b = scanner.nextInt();

        switch(escolha){
            case 1:
                soma(a,b);
                break;
            case 2:
                subtracao(a,b);
                break;
            case 3:
                multiplicacao(a,b);
                break;
            case 4:
                divisao(a,b);
                break;
            default:
                System.out.println("Número Inválido");
        }

    }

}
