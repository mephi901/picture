package picture;

import org.apache.commons.math3.distribution.*;


/**
 *
 * @author b17-901
 */
public class SuperFunc {
   public static double r;
 
    public  static double Start(){
         WeibullDistribution W =new WeibullDistribution(5,1);
        return r=W.sample();
       
    }

}
