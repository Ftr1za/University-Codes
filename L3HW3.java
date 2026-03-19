import java.util.Scanner;

public class L3HW3{
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