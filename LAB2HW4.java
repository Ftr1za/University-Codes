// A triangle has 3 sides. Write a program which asks the users for input. Based on the input, your program should output whether it is an Equilateral, Isosceles or Scalene.
// Equilateral triangle has three sides with equal length 
// Isosceles triangle has two sides with equal length and another side is different
// Scalene triangle has different lengths in each side

import java.util.Scanner;

public class LAB2HW4 {
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
