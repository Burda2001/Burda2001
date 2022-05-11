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
        soma(2,4);
        subtracao(2,3);
        divisao(2,3);
        multiplicacao(2,3);
    }

}
