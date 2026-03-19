// In Hogwarts, apprentice wizards brew magic potions using glowing herbs and sparkling crystals collected from the Whispering Woods. 
// You have a stash of H herbs and C crystals. Each successful potion requires exactly 3 herbs and 2 crystals. 
// Brew as many potions as possible without running short mid-mix stop when you can't complete another full potion. 
// After brewing, check the total potions: if even, the batch is perfectly balanced ("Stable Elixir"); if odd, it's unpredictably fizzy ("Volatile Brew"). Output the number of potions and the balance message.

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
