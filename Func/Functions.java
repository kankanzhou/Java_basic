import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Functions {
    
    public static void main(String[] args) {  

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            s = in.readLine();
            n = Integer.parseInt(s);
        } catch(IOException e) {}

        System.out.println("this is a char" + s);
    }
}