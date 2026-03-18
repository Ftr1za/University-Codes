// A new Smart Electric Car Charging Station has been set up in your city.
// The station automatically calculates the total cost for charging based on the amount of electricity consumed (in kWh) and the type of user.
// To make the billing fair and environmentally conscious, the station follows these rules:
// Base rate: 15 Taka per kWh.
// Discounts and surcharges:
// Students (under 18 years old) get a 20% discount on the total bill.
// Regular users (18 to 60 years old) pay the normal rate.
// Senior citizens (above 60 years old) get a 10% discount.
// High usage surcharge:
// If total energy consumption exceeds 100 kWh, a 5% surcharge is added after applying any discount.

import java.util.Scanner;

public class LAB2HW2 {
  public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Age: ");
    int age = sc.nextInt();
    System.out.println("Electricity Consumed: ");
    int eUsage = sc.nextInt();
    
    double discount = 0;
    double extra = 0;
    double bill = eUsage * 15.0 ;
    
    if (age > 0 && age < 18) {
      discount = 20.0/100;
    }
    else if (age > 60) {
      discount = 10.0/100;
    }
    
    if (eUsage > 100){
      extra = 5.0/100;
    }
    
    double Tbill = bill - (bill * discount);
    double Fbill = Tbill + (Tbill * extra);
    System.out.println("Final Bill: " + Fbill + " Taka");
    sc.close();
  }
}
