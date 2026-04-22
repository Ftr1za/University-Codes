// In the magical world of Harry Potter, the Sorting Hat wants to find the most
// "powerful" (longest) spell name from several one word spells that students whisper
// during the Sorting Ceremony. Each student whispers a spell one by one. 
// The students keep whispering spells one by one until one of them shouts “stop”(case-sensitive), 
// which signals the Sorting Hat to stop listening. However, some students are mischievous and add weird symbols, extra spaces, or uppercase letters to confuse the Sorting Hat.
// The Sorting Hat will Ignore all non-letter characters (keep only uppercase letters and lowercase letters), then it will convert it to Upper case letters.
// Find the longest spell name whispered and If two spell names are the same length, choose the first one whispered. Also, calculate the power level of the spell as the sum of ASCII values of its letters.

import java.util.Scanner; 
public class LAB6HW3{ 
  public static void main(String [] args){ 
    Scanner sc = new Scanner(System.in); 
    String temp = ""; 
    String temp2 = ""; 
    int max_p = 0; 
    String max_s ="";
    System.out.println("Names of the spells: ");
    while(true){ 
      temp = sc.nextLine(); 
      if ( temp.equals("stop") ){ break;} 
      else{ 
        for (int idx = 0; idx <= temp.length()-1; idx++){ 
          char ch = temp.charAt(idx); 
          int ascii = (int) ch; 
          if ( ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122 ){ 
            if ( ascii >= 97 && ascii <=122){ 
              ch = (char) (ascii-32); 
              temp2 +=ch; 
            } 
            else {
              temp2 +=ch;
            } 
          } 
        } 
        if (max_s.length() < temp2.length()){
          max_s = temp2; 
        }  
        temp2 = ""; 
      } 
    } 
    System.out.println("Largest Spell : "+max_s); 
    for (int idx2 = 0; idx2 <= max_s.length()-1; idx2++){ 
      char ch2 = max_s.charAt(idx2); 
      int ascii = (int) ch2;
      max_p += ascii; 
    } 
    System.out.println("Power Level : "+max_p); 
    sc.close(); 
  } 
}
