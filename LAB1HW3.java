// Rafi has just started learning Java programming. His teacher gives him a simple challenge to test his understanding of integer manipulation and modulus operations.
// The task is to display the two rightmost digits of his student ID in reverse order.
// Rafi knows his student ID is 1000054943, and he must write a Java program that prints the digits 3 and then 4, since those are the two rightmost digits reversed.

public class LAB1HW3{
  public static void main(String [] args){
   int s_id = 1000054943;
   int last2 = s_id % 100;
   int lastD1 = last2 % 10;
   int lastD2 = last2 / 10;
   System.out.println(lastD1);
   System.out.println(lastD2);
  }
}
