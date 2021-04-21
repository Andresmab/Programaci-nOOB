public class NumImPa{

private static int limite;
private static int superior;

public static void main(String[] args){
ParIm(1,10);
}

public static void ParIm(int limite, int superior){

  for(int i=limite;i<=superior;i++){
    if(i%2==0){
      System.out.print(i);
    }
  }

  System.out.print("\n");

  int i=limite;

  while(i<=superior){

  if(i%2==1){
    System.out.print(i);
  }
  i++;
  }
}
}