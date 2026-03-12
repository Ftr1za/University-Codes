//NASA has recently shared the total time (in minutes) since one of its space missions was launched.
//As a software engineer working at the mission control center, your task is to help them calculate how many years and days have passed since the launch.
//Therefore, write a Java program that can do the conversion.
//NOTE: For simplicity, assume each year has exactly 365 days.
//Test Data:
//Given the number of minutes: 3456789
//Expected Output:
//3456789 minutes is approximately 6 years and 210 days

public class LHW1{
  public static void main(String [] args){
    int t_min =  3456789;
    int t_day = (t_min / 60)/24;
    int r_day = t_day % 365;
    int t_year = t_day / 365;
    System.out.printf("%d minutes is approximately %d years and %d days.\n", t_min, t_year, r_day);
  }
}

