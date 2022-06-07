import javax.swing.*;

public class Jframe {
    public static void main(String[]args){
        // Jframe é uma forma de GUI

        JFrame frame = new JFrame();     //cria um frame

        frame.setTitle("Amo a Borbinha");    //Define o nome da Janela;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //comando para o programa finalizar quando clicar no exit;
        frame.setSize(600,600);  //define o tamanho do frame(width e height);
        frame.setVisible(true);     //faz o frame ser visivel;
        frame.setResizable(false); // Impede o frame de ser redimensionada;

        ImageIcon image = new ImageIcon("icon.jpg");
        frame.setIconImage(image.getImage());

    }
}
