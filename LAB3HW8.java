//Write a Java code that asks an integer as input from the user and takes that many integer inputs. Your task is to count how many numbers are non-negative and negative.

import java.util.Scanner;

public class LAB3HW8{
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
