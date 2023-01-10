import java.io.IOException;
import java.util.Scanner;
public class SystemIn {
    
    public static void main(String[] args) {  
        char c = ' ';
        try {
            c = (char) System.in.read();
        } catch(IOException e) {}
        System.out.println("this is a char" + c);
    }
}
