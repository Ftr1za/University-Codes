import java.util.Scanner;

public class LAB6HW2{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String iS = sc.nextLine();
    String vowel = "";
    String Rvowel = "";
    String fS = new String("");
    
    for (int idx = 0; idx <= iS.length()-1 ; idx++){
      char ch = iS.charAt(idx);
      if (ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'
            ||ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
        vowel += ch;
      }
    }
    for (int idx2 = vowel.length()-1 ; idx2 >= 0  ; idx2--){
      char ch2 = vowel.charAt(idx2);
      Rvowel += ch2;
    }
    int count= 0;
    for ( int i = 0; i <= iS.length()-1; i++){
      char fch = iS.charAt(i);
      if (fch == 'A'||fch == 'E'||fch == 'I'||fch == 'O'||fch == 'U'
            ||fch == 'a'||fch == 'e'||fch == 'i'||fch == 'o'||fch == 'u'){
        fch = Rvowel.charAt(count);
        count++;
      }
      fS+= fch;
    }
    System.out.println(fS);
    sc.close();
  }
}