import java.util.Scanner;

public class L3HW4{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (;true;){
      int digit = num % 10;
      num = num/10;
      if (num % 10 == 0){
        System.out.print(digit + "\n");
        break;
      }
      else {
        System.out.print(digit +",");
      }
    }
  }
}