import java.util.Scanner;

public class L3HW8{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int num = sc.nextInt();
    int p_num = 0;
    int n_num = 0;
    for (int i = 1; i <= num ; i++){
      System.out.println("Enter number "+ i +":");
      int numInput = sc.nextInt();
      if (numInput < 0){
        n_num +=1;
      }
      else { p_num += 1;}
    }
    System.out.println(p_num + " Non-negative Numbers");
    System.out.println(n_num + " Negative Numbers");
  }
}