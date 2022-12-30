
package Swing;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class JButtonRound extends JButton{
    private Shape shape;
    private int arc; // Diametro do arco da margem do botão
    private boolean circleArc = true; // Se true, o arco é dado por getHeight() tornando sempre redondo
    
    public JButtonRound (){
        setContentAreaFilled (false);
        arc = 25;
    }
    
    public void setArc(int arcDiameter){
        arc = arcDiameter;
    }
    public int getArc() {
        return arc;
    }
    public void setCircleArc(boolean bool) {
        circleArc = bool;
    }
    public boolean getCircleArc() {
        return circleArc;
    }
    @Override
    protected void paintComponent(Graphics g) {
        arc = circleArc ? getHeight() : arc;
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, arc, arc);
        super.paintComponent(g);
    }
    @Override
    protected void paintBorder(Graphics g) {
        arc = circleArc ? getHeight() : arc;
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getForeground());
        g2.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, arc, arc);
    }
    @Override
    public boolean contains(int x, int y) {
        arc = circleArc ? getHeight() : arc;
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, arc, arc);
        }
        return shape.contains(x, y);
    }
}
