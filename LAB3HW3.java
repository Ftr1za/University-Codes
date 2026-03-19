// In a sunny mountain cave, a baby dragon named Charmander plays a fun game to evolve. Charmander starts with E energy points.
// He must blow fire across N small rivers. For each river i, the distance is D units. If D is 5 or less, it costs 2 energy. 
// If D is more than 5, it costs D / 2 energy (whole numbers only). Take away the energy after each blow. 
// If energy goes below 0, Charmander gets tired and stops. Tell the river where he stops, or if he finishes all, say how much energy is left.

import java.util.Scanner;

public class LAB3HW3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Energy (E): ");
    int energy = sc.nextInt();
    System.out.println("Number of River (N): ");
    int ri_num = sc.nextInt();
    
    
    
    for (int i = 1; i <= ri_num; i++){
      System.out.println("Enter River Distance D"+i+": ");
      int dis = sc.nextInt();
      if (dis <= 5){
        energy -=2;
      }
      else if (dis > 5){
        energy -= dis/2;
      }
      if (energy < 0){
        System.out.println("Tired at River "+ i);
        break;
      }
    }
    
    if (energy >=0){
      System.out.println("All Done");
      System.out.println(energy +" energy Left");
    }
  }
}
