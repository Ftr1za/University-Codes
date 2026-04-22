import java.util.Scanner; 
public class LAB6HW5{ 
  public static void main(String [] args){ 
    Scanner sc = new Scanner(System.in);
    String in_s = sc.nextLine();
    String oneSP = "";
    String words = "";
    
    for ( int i = 0 ; i < in_s.length(); i++){
      if (in_s.charAt(i) == ' ' && i > 0){ 
        if (in_s.charAt(i-1) != in_s.charAt(i)){
          oneSP += in_s.charAt(i); 
        }
      }
      else{
        oneSP += in_s.charAt(i);
      }
    }
    
    for ( int j= 0; j < oneSP.length(); j++){
      if ( oneSP.charAt(j)== ' '){
        if ( j == oneSP.length()-1){
          continue;
        }
        else{
          words = "";
          continue;
        }
      }
      else{
        words += oneSP.charAt(j);
      }
    }
    System.out.println(words.length());
    sc.close();
  }
}
