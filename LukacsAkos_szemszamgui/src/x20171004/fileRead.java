
package x20171004;

import java.io.File;
import java.util.Scanner;

public class fileRead {
    public static void main(String[] args) throws Exception{
        File theFile = new File("input.txt");
        try{
            Scanner eyes = new Scanner(theFile);
            while (eyes.hasNextLine()) {                
                String sor = eyes.nextLine();
                System.out.println(sor);
            }

        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
