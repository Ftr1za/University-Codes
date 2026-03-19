//Write a Java program which adds all numbers that are multiples of either 7 or 9 but not both, up to 600. Use only a single loop in your program.

public class LAB3HW7{
  public static void main(String [] args){
    int sum = 0;
    for (int i =1; i <= 600 ; i++){
      if ((i % 7 == 0 || i % 9 == 0) && !(i % 7 == 0 && i % 9 == 0)){
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
