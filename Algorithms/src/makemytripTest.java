import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class makemytripTest {
 public static void main(String[] args) throws IOException{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String line = br.readLine();
      int N = Integer.parseInt(line);
      System.out.println();
      for (int i = 0; i < N; i++) {
       System.out.println(br.readLine().length());
      }
   
	 
 }
}
