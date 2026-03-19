import java.util.Scanner;

public class L3HW6{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int factors = 0;
    int factor_sum = 0;
    for (int i=1 ; i < num; i++){
      if (num % i==0){
        factors +=1;
        factor_sum += i;
      }
    }
    if (factors <=1){System.out.println(num + " is a prime number");}
    else {System.out.println(num + " is not a prime number");};
    if (factor_sum == num){System.out.println(num + " is a perfect number");}
    else {System.out.println(num + " is not a perfect number");};
  }
}
