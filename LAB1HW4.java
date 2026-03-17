// Rafi is helping his friend place a Wi-Fi router in a rectangular room. 
// He wants to know the shortest straight-line distance (diagonal) between two opposite corners of the room so that the Wi-Fi signal can reach the farthest corner efficiently. 
// Write a Java program to calculate the diagonal distance using Pythagoras’ Theorem, you can assume the length and width of the room is 10 and 13 respectively.


public class LAB1HW4{
  public static void main(String [] args){
   int lenth = 10;
   int width = 13;
   double diagonal = Math.sqrt(Math.pow(10,2) + Math.pow(13,2));
   System.out.println(diagonal);
  }
}
