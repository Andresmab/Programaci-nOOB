public class Calculadora{

  private static float num1;
  private static float num2;
  private static int operacion;
  private static float result;
  private static float resultado;

  public static void main(String[] args){

    Operar(4,4,2,result);

  }

  public static void Operar(int operacion,float num1,float num2, float result){

  switch (operacion){
    case 1:
      result=num1+num2;
      break;
    case 2:
      result=num1-num2;
      break;
    case 3:
      result=num1*num2;
      break;
    case 4:
        if (num2==0){
        System.out.print("No se puede operar");}
        else{
          result=num1/num2;
        break;
        }
      break;
  }
      System.out.print(result);
  }
}