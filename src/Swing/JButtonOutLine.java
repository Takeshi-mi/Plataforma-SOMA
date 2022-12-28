
package Swing;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;


// Criando botão redondo. Queria arrendondar um botão no JFrame, mas não achei. Fui procurar um tutorial no youtube. 

public class JButtonOutLine extends JButton{
    
    public JButtonOutLine (){
        setContentAreaFilled (false);
        setBorder (new EmptyBorder (5, 0, 5, 0));
        setBackground (Color. WHITE);
        setCursor (new Cursor(Cursor.HAND_CURSOR));
    }
    
    protected void paintComponent (Graphics g) {
        int widht = getWidth();
        int height = getHeight();
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawRoundRect (0, 0, widht - 1, height - 1, height, height);
        super.paintComponent (g);
                                                   
    }
    // NO FINAL DAS CONTAS NEM USEI. Preferi colocar uma JLabel com mouseAction mudando a imagem pra parecer animação de botão
    
}
