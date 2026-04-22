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