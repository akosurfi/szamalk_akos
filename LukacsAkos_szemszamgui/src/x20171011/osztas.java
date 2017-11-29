package x20171011;

import java.util.Scanner;

public class osztas {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Kérem az osztandót!");
    int osztandó = sc.nextInt();
    System.out.println("Kérem az osztót!");
    int osztó = sc.nextInt();

    boolean sikeres = false;
    
//    if (osztó == 0) {
//      System.out.println("Ne nullával akarj már osztani. *facepalm*");
//    } else {
//      double hányados = (double) (osztandó / osztó);
//      System.out.println(osztandó + "/" + osztó + " - " + hányados);
//    }


  try{
    double hányados = (double) (osztandó / osztó);
    System.out.println(osztandó + "/" + osztó + " = " + hányados);
    sikeres = true;
  }
  catch(ArithmeticException ae){
    System.out.println("hiba" + ae.getMessage());
  }
  finally{
    if (sikeres) {
      System.out.println("Az osztás sikeres, hurrá");
    }else{
      System.out.println("Nem sikerült ehhh");
    }
  }
  }
}
