/**
 * This class calculates the maximum value of the result given the func() equation and returns the result
 * as well as the two values that give the result.
 **/

public class F{
  /**
   * Empty constructor.
   * */
  public F(){
    
  }
  /**
   * Equation for the two integers.
   */
  private static int func(int x){
    int y=0;
    y = (12-x)*(int)Math.round(Math.pow(x, 3));
    return y;
  }
  /**
   * 
   */
  public static void calculate(int rounds){
    int result;
    int final_result=0;
    for (int x=0; x<=rounds; x++){
      System.out.println();
      result=func(x);
    // check if result's maxed out by checking if the result is lower than final result
    // in that case, the result maxed out in the previous iteration. Take numbers in the
    // previous step. (12-(x-1)) and (x-1) on step x.
      if (final_result>result){
        System.out.printf("Maximum is %d, the two numbers are %d and %d.", final_result, (12-(x-1)), (x-1));
        System.out.println("\nDone.");
        break; //limit reached, quit.
      }else{
        final_result=result;
      }
    }
  }
  
  public static void main(String args []){
    F.calculate(20);//put any number here.
    //System.exit(0);
  }
}