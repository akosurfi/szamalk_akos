
package x20171004;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class fileWrite {
    public static void main(String[] args) throws Exception{
        try {
            FileWriter theFile = new FileWriter("output.txt");
            BufferedWriter write = new BufferedWriter(theFile);
            for (int i = 0; i <= 90; i++) {
                write.write(Integer.toString(i)+" ");
                if (i%10==0) {
                    write.newLine();
                }
            }
            
            write.close();
            
        } catch (Exception e) {
            System.out.println("I/O hiba "+e.getMessage());
        }
    }
}
