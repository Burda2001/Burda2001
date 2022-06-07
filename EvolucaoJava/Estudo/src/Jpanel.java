import javax.swing.JOptionPane;
public class Jpanel {
    public static void main(String[]args){
        String primeiroNumero, segundoNumero;
        int num1, num2, soma;

        primeiroNumero=JOptionPane.showInputDialog("Insira o primeiro número: ");
        segundoNumero=JOptionPane.showInputDialog("Insira o segundo número: ");

        num1= Integer.parseInt(primeiroNumero);
        num2= Integer.parseInt(segundoNumero);
        soma=num1+num2;

        JOptionPane.showMessageDialog(null,"A soma dos números é:"+soma);
        System.exit(0);

    }
}
