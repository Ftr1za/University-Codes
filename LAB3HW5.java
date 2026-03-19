// In a secret city, you are on a mission to open a high-tech vault that protects a treasure!
// The vault has a N-digit secret code (like 32768). To open it, you must say each digit one by one, from left to right, exactly as shown on the screen. 
// Your smart watch can read the full number, but you need to break it into digits and speak them out loud like:
// "3... 2... 7... 6... 8..."

// If you get even one digit wrong, the alarm goes off!

// Write a Java program that: 
// Asks you: "Enter the N-digit vault code:"
// Reads the number
// Prints the digits forward, separated by commas

// Rules:
// You cannot use Math.pow()
// You must count the digits first
// Then use division and remainder to pull out each digit
// Print them from left to right.

import java.util.Scanner;

public class LAB3HW5{
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
