import java.util.Scanner; 
public class LAB6HW4{ 
  public static void main(String [] args){ 
    Scanner sc = new Scanner(System.in);
    System.out.print("Fan Message: ");
    String f_msg = sc.nextLine();
    String temp = "";
    String temp2 ="";
    
    int bayern = 0;
    int madrid = 0;
    int close = 0;
    int destroy = 0;
    
    for (int i = 0; i <= f_msg.length() -1; i++){
      char ch = f_msg.charAt(i);
      int ascii = (int) ch;
      if ( ascii >= 97 && ascii <= 122 || ascii >= 65 && ascii <=90){
        if (ascii >= 97 && ascii <= 122){
          ascii -=32;
          ch = (char) ascii;
          temp += ch;
        }
        else{
          ch = (char) ascii;
          temp += ch;
        }
      }
      else if (ch == ' '){temp += ch;}
    }

    for (int j = 0; j < temp.length(); j++){
      char temp_ch = temp.charAt(j);
      if ( temp_ch == ' '){
        if (temp2.equals("MADRID")){
          madrid ++;
        }
        else if (temp2.equals("BAYERN")){
          bayern++;
        }
        else if (temp2.equals("CLOSE")){
          close++;
        }
        else if (temp2.equals("DESTROY")){
          destroy++;
        }
        temp2 = "";
      }
      else {
        temp2 += temp_ch;
      }
    }
    if (temp2.equals("MADRID")){madrid++;}
    if (temp2.equals("BAYERN")){bayern++;}
    if (temp2.equals("CLOSE")){close++;}
    if (temp2.equals("DESTROY")){destroy++;}
    if (bayern < madrid){System.out.println("Madrid Supporter");}
    if (bayern == madrid){System.out.println("Neutral");}
    if (bayern > madrid){System.out.println("Bayern Supporter");}
    if (close > 0){System.out.println("Fan expect a close match");}
    if (destroy > 0){System.out.println("Fan expects a dominating victory!");}
    if (destroy == 0 && close == 0){
      System.out.println("Hard to read the fan sentiment");
    }
    sc.close(); 
  }
}
