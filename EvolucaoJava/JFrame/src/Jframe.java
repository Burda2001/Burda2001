import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Jframe {
    public static void main(String[]args){

        //Criando uma borda
        Border borda = BorderFactory.createLineBorder(Color.YELLOW,3);  //cria uma borda, pode deefinir a cor e o a grossura;

        //CONFIGURAÇÃO DO FRAME;
        JFrame frame = new JFrame();     //cria um frame
        frame.setTitle("Amo a Borbinha");    //Define o nome da Janela;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //comando para o programa finalizar quando clicar no exit;
        frame.setSize(600,600);  //define o tamanho do frame(width e height);
        frame.setVisible(true);     //faz o frame ser visivel;
        ImageIcon image = new ImageIcon("C:\\Users\\match\\Documents\\GitHub\\Mateus-Burda\\EvolucaoJava\\JFrame\\src\\icon.jpeg");  // Cria um ImageIcon;
        frame.setIconImage(image.getImage());   // Altera o icone do frame;

        //CONFIGURAÇÕES DO LABEL;
        JLabel label = new JLabel();    //Cria o label;
        frame.add(label); //Adiciona o label criado acima no frame;
        label.setText("Quer casar comigo?");   //Define o texto do label;
        label.setIcon(image); //define o icone do label,
        label.setHorizontalTextPosition(JLabel.CENTER); // Define a orientação horizontal do label de acordo com a imageem do Icone;
        label.setVerticalTextPosition(JLabel.TOP);  //Define a orintação vertical de acordo com a imageem do Icone;
        label.setForeground(Color.ORANGE); //Define a cor de fonte do label, também é possivel escolher uma cor pelo código RGB ou HEX;
        label.setFont(new Font("Arial",Font.BOLD,28)); //Define a fonte, a estilização da fonte, e o tamanho da fonte do label;
        label.setBackground(Color.BLACK); //Define a cor de fundo do label;
        label.setOpaque(true); //Define se o label é opaco ou não, necessário para que a cor do background apareça;
        label.setBorder(borda); //Define qual a borda do label
    }
}
