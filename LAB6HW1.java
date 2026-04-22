// A secret meeting of agents is scheduled, and entry requires a 2-digit PIN. To keep the PIN confidential, the mission leader has hidden it inside a sentence. 
//The rule is simple: the largest two-digit number present in the sentence will serve as the PIN.

// You, being the only Java programmer in the team, are tasked with writing a Java program that:
// ● Takes a sentence (a single line of text) as input from the user.
// ● Scans the entire sentence to find all two-digit numbers (from 00 to 99) embedded within it.
// ● Identifies the highest (maximum) two-digit number among them.
// ● Outputs that number as the PIN.
// ● If no two-digit number is found in the sentence, the program should output 0 as the default PIN.


import java.util.Scanner;

public class LAB6HW1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Message: ");
    String s = sc.nextLine();
    String d = "";
    int max_d = 0;
    int num = 0;
    int d_count = 0;
    
    for (int idx = 0; idx <= s.length()-1 ; idx++){
      char ch = s.charAt(idx);
      int ascii = (int) ch;
      if ( ascii >= 48 && ascii <= 57){
        char ch2 = (char) ascii;
        d += ch2;
      }
    
    }
    if ( d.length() > 0){
      for (int i = 0; i <= d.length()-1 ; i++){
        char digit = d.charAt(i);
        int f_digit = digit - '0';
        num = num*10 + f_digit;
        d_count++;
        if (d_count == 2){
          if ( num > max_d){
          max_d = num;
        }
          num =0;
          d_count = 0;
        }
      }
      System.out.println("2-Digit PIN: "+max_d);
    }
    else {System.out.println("2-Digit PIN: "+0);}
    sc.close();
  }
}

      
          
