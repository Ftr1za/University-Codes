// GymFit Elite uses an AI fitness system to calculate effective calorie burn per exercise with advanced rules. 
// Your task is to write a java programme to calculate the average of earned calories. For each member, input the number of exercises and their raw calories. 
// Each day a member can do the highest 3 exercises. 
// If the calorie is greater than 350 then add 50% bonus, add 10% penalty to all if every exercise is less than 200, and give 50 calories flat bonus per exercise if the raw average is greater than 400. 
// Now calculate the total calories earned and print the average calories earned a day.

import java.util.Scanner;

public class LAB4HW4 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Number of Members: ");
    int memNum = sc.nextInt();
    
    for (int i=1 ; i<=memNum ;i++){
      double avgCal = 0;
      double totalCal = 0;
      int calTracker = 0;
      System.out.printf("Exercises for Member-%d:\n",i);
      int exNum = sc.nextInt();
      
      if (exNum > 3){
        exNum =3;
        System.out.printf("(Can’t do more than 3 exercise)\n\n");
      }
      
      for (int k=1 ; k <= exNum ; k++){
        System.out.printf("Exercise-%d:\n",k);
        double cal = sc.nextInt();
        
        if (cal > 350){
          cal = cal + (cal * (50.0/100));
        }
        totalCal+= cal;
        
        if (cal <200){
          calTracker++;
        }
      }
      avgCal = totalCal/exNum;
      
      if (avgCal > 400){
        avgCal *= exNum;
        avgCal +=150;
        avgCal = avgCal/exNum;
      }
      
      if (calTracker == exNum){
        avgCal = avgCal - (avgCal * (10.0/100));
      }
      System.out.printf("Average calories earned per day for Member-%d: %.3f\n",i,avgCal);
    }
  }
}
