import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("/Users/swetha/Documents/Java/Begin/DataStructures/src/input.txt");
         out = new FileOutputStream("/Users/swetha/Documents/Java/Begin/DataStructures/src/output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
        	 	System.out.println(c);
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}