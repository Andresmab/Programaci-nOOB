public class Carro{
  private static String Color;
  private static String Año; 
  private static String Modelo;

  public static void main(String[] args){
    Valores("Rojo","2035","R8");
    System.out.print(" Este es un carro de color "+Color+" de modelo "+Modelo+" del año "+Año);
  }

  public static void Valores(String Col,String Añ,String Mod){
    Color=Col;
    Año=Añ;
    Modelo=Mod;
  }
}