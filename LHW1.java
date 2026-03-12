public class LHW1{
  public static void main(String [] args){
    int t_min =  3456789;
    int t_day = (t_min / 60)/24;
    int r_day = t_day % 365;
    int t_year = t_day / 365;
    System.out.printf("%d minutes is approximately %d years and %d days.\n", t_min, t_year, r_day);
  }
}
