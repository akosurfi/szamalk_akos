
package x20171018;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


public class feladat {
  public static void main(String[] args) throws Exception{
    DecimalFormat df = new DecimalFormat("#.###");
    Scanner sc = new Scanner(System.in);
    System.out.println("Írjon be egy számot!");
    
    try{
        double szam = sc.nextDouble();
        double ngyok = Math.sqrt(szam);
        if (Double.isNaN(ngyok)) 
            throw new Exception();
        System.out.println(df.format(szam) + " négyzetgyöke " + df.format(ngyok));
      
    }catch(InputMismatchException ime){
        System.err.println("Csak számokbül lehet négyzetgyököt vonni");
    }
    catch(Exception e){
      System.err.println("Negatív számból nem lehet négyzetgyököt vonni!");
    }
  }
}
