// You need to write a Java program that asks the user to input the number of days (N). 
// Then, for each day, input the sales of the 3 products.
// For each day, calculate the total sales, apply the correct tax based on the total, and display the total sales including tax.

// If the total sales for the day equal to or greater than 100, a 2% tax is added.
// If the total sales equal to or greater than 200, a 5% tax is applied instead.
// If the total sales equal to or greater than 500, a 10% tax is applied instead.


import java.util.Scanner;

public class LAB4HW3 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of days: ");
    int d_count = sc.nextInt();
    
    for (int i= 1; i <= d_count; i++){
      System.out.printf("Enter sales for Day %d:\n",i);
      double sum=0;
      double tax =0;
      for (int j=1 ; j<=3; j++){
        int sales = sc.nextInt();
        sum+=sales;
      }
      if (sum >= 100 && sum <200){
        tax = 2.0/100;
      }
      else if (sum >= 200 && sum <500){
        tax = 5.0/100;
      }
      else if (sum >= 500){
        tax = 10.0/100;
      }
      double t_sales = sum + (sum * tax);
      System.out.printf("Day %d: Total Sales with Tax: %.1f\n",i,t_sales);
    }
  }
}
