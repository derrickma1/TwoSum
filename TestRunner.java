import org.junit.runner.Result;  
import org.junit.runner.JUnitCore;  
import org.junit.runner.notification.Failure;  
  
public class TestRunner {  
   public static void main(String[] args) {  
      Result result = JUnitCore.runClasses(TwoSumTest.class);  
      if(!result.wasSuccessful()) {
      System.out.println("There is " + result.getFailureCount() + " failure over " + result.getRunCount() + " tests case");
      for (Failure fail : result.getFailures()) {  
         System.out.println(fail.toString());  
      }  
      }
      else {
      System.out.println("Accepted!");
      System.out.println("All Test Cases Passed");
      System.out.println("Total runtime is "+result.getRunTime() + " ms");
      }
   }  
}     