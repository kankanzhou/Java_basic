import java.io.IOException;
import java.util.Scanner;
public class SystemIn {
    
    public static void main(String[] args) {  
       // Scanner scanner = new Scanner(System.in);    
        //int num = scanner.nextInt(); 
        char c = ' ';
        try {
            c = (char) System.in.read();
        } catch(IOException e) {}
     //   System.out.println(num);
        System.out.println("this is a char" + c);
    }
}