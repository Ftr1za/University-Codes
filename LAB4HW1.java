// You need to write a Java program that asks the user to input a starting number and an ending number. The program must find and display all Armstrong numbers within this range (inclusive).
// An Armstrong number is a number whose digits’ values, each raised to the power of the total number of digits, add up to the number itself.


import java.util.Scanner;

public class LAB4HW1 {
  public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the starting number:");
    int i_num = input.nextInt();
    System.out.print("Enter the ending number:");
    int f_num = input.nextInt();
    int arms_tracker = 0;
    
    for ( int k = i_num; k<=f_num; k++){
      int num = k;
      int num_backup = k;
      int num_backup2 = k;
      int tracker = 0;
      int sum = 0;
      
      for (; true; ){
        num /= 10;
        tracker++;
        if (num == 0){
          break;
        }
      }
      
      for (int j = 1; j <= tracker; j++){
        int digit = num_backup%10;
        num_backup /=10;
        sum += Math.pow(digit, tracker);
      }
      if (sum == num_backup2){
        arms_tracker ++;
        if (arms_tracker ==1){
          System.out.printf("%dst Armstrong number: %d\n", arms_tracker,sum);
        }
        else if (arms_tracker ==2){
          System.out.printf("%dnd Armstrong number: %d\n", arms_tracker,sum);
        }
        else if (arms_tracker ==3){
          System.out.printf("%drd Armstrong number: %d\n", arms_tracker,sum);
        }
        else{
          System.out.printf("%dth Armstrong number: %d\n", arms_tracker,sum);
        }
      }
    }
    input.close();
  }
}
