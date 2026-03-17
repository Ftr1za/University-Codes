// Design a Java program to calculate Sin and Cos values from a right-angled triangle.
// Assume the values of a and b are 4.5 and 9.5 respectively. Finally, print the Sin and Cos values of angle A and angle B (SinA, CosA, SinB, CosB).

public class LAB1HW5{
  public static void main(String [] args){
    double a = 4.5;
    double b = 9.5;
    double c = Math.sqrt( Math.pow(a ,2) + Math.pow(b ,2));
    double SinA = a / c;
    double SinB = b / c;
    double CosA = b / c;
    double CosB = a / c;
    System.out.println("Sin(A)= " + SinA);
    System.out.println("Cos(A)= " + CosA);
    System.out.println("Sin(B)= " + SinB);
    System.out.println("Cos(B)= " + CosB);
  }
}
