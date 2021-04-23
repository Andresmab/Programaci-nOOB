import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class CirculoDraw extends JApplet{
int i,j;
double r,c,x,y,centro=100;

public void paint (Graphics g) {

    for (int i=0;i<=180;i++){
      for (int j=0;j<=180;j++){
        x=Math.pow((i-centro),2);
        y=Math.pow((j-centro),2);
        c=x+y;
        r=Math.sqrt(c);
        if(r<=60){
          g.drawString(".",i,j);
        }
      }
    }




}

public static void main(String[] args){
    JFrame frame = new JFrame ("Cargando JApplet");
    CirculoDraw CirculoApplet = new CirculoDraw();
    CirculoApplet.init();
    frame.getContentPane().add(CirculoApplet);
    frame.setSize(200,200);
    frame.setVisible(true);
}
}