package exercicio01;
import java.util.Scanner;
public class Q02 {
  public static void main(String[] args) {
  System.out.println("ponto a :");   
  Scanner Sc1 = new Scanner(System.in);
   var a = Sc1.nextDouble();
   System.out.println("ponto b");
   var b = Sc1.nextDouble();
    System.out.println("valor de x :");
    var x = Sc1.nextDouble();
    Sc1.close();
    System.out.println("O valor de y é : "+((a*x)+b));
}
}
