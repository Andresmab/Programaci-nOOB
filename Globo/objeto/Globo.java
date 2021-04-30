package objeto;
import java.awt.*;

public class Globo{
 private int ancho;
 private int xCoord, yCoord;
 public Globo (int anchoInicial, int xInicial, int
yInicial) {
 ancho = anchoInicial;
 xCoord = xInicial;
 yCoord = yInicial;
 }

 public void cambiarTamaño (int cambio) {
 ancho = ancho + cambio;
 }

 public void mostrar (Graphics g) {
 g.setColor(Color.red);
 g.fillRect (xCoord, yCoord, ancho, ancho);
 }

 public void mostrar2 (Graphics g) {
 //Color colorFondo=new Color(238, 238, 238, 255);
 g.setColor(Color.white);
 g.fillRect (xCoord, yCoord, ancho, ancho);
 }
}