package x20171018;

import java.util.Scanner;
import java.util.StringTokenizer;


public class feladat2 {
    public static void main(String[] args) {
      int szam;
      int sum = 0;
      String szum="", actual;
      Scanner sc = new Scanner(System.in);
      System.out.println("Kérek több egész számot vesszövel elválasztva");
      
      String sor = sc.nextLine();
      String hibasAdatok= "";
      StringTokenizer st = new StringTokenizer(sor, " ");
      //int db = st.countTokens();
      int db =0;
      while(st.hasMoreTokens()){
      try{
        actual = st.nextToken();
        szam = Integer.parseInt(actual);
        sum += szam;
        szum = actual;
        db++;
      }catch(Exception e){
        hibasAdatok += e.getMessage().split(":")[1].trim().replace("\"", "")+":";
    }
      System.out.println("A beolvasott számok (" + db + "db) összege: " + sum);
      szum = szum.substring(0, szum.length()-1)+"="+sum;
      System.out.println("Az összeadás: " + szum);
      System.out.println(hibasAdatok);
      }
  }
}
