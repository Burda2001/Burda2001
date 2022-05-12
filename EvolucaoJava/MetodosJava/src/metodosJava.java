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
    Scanner scanner = new Scanner(Sytem.in);
        System.out.println("Insira o primeiro número: ");
        a = scanner.nextInt();
        System.out.println("Insira o segundo número: ");
        b = scanner.nextInt();
        System.out.println(a+b);

    }

}
