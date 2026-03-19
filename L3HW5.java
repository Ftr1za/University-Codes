import java.util.Scanner;

public class L3HW5{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the N-digit vault code: ");
    int code = sc.nextInt();
    int codeBackup = code;
    int tracker = 0;
    int power = 1;
    
    
    for (;true;){
      codeBackup = codeBackup/10;
      tracker += 1;
      if (codeBackup%10 == 0){
        break;
      }
    }
    for (int i = tracker; i>0; i--){ 
      power =1;
      
      for (int j= i-1; j >0; j--){
        power *=10;
      }
      int digit = code/power;
      code= code % power;
      
      if (i == 1){System.out.print(digit+"\n");}
      else {System.out.print(digit+",");}
    }
  }
}
