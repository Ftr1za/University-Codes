import java.util.Scanner;

public class L3HW2{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter number of Herbs (H): ");
    int herbs = sc.nextInt();
    System.out.println("Please Enter number of Crystals (C): ");
    int crys = sc.nextInt();
    int tracker = 0;
    for ( ; true ; ){
      if ( herbs < 3 || crys < 2){
        break;
      }
      tracker = tracker + 1;
      System.out.println("Potion-"+tracker+" created");
      herbs -= 3;
      crys -= 2;
      System.out.println("Remaining Herbs: "+herbs+", Remaining Crystals: "+crys);
    }
    System.out.println("Potions Created: "+ tracker);
    if ( tracker % 2 == 0){System.out.println("Stable Brew");}
    else {System.out.println("Volatile Elixir");}
  }
}
