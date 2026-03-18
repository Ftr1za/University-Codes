import java.util.Scanner;

public class L2HW4 {
  public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    int side1 = sc.nextInt();
    int side2 = sc.nextInt();
    int side3 = sc.nextInt();
    
    if (side1 == side2 && side2 == side3){
      System.out.println("This is a Equilateral triangle");
    }
    else if (side1 != side2 && side2 != side3 && side1 != side3){
      System.out.println("This is a Scalene triangle");
    }
    else if ((side1 == side2 && side2 != side3)||
             (side2 == side3 && side2 != side1)|| 
             (side1 == side3 && side3 != side2)){
     System.out.println("This is a Isosceles triangle"); 
    }
  }
}