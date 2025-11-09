package Function;
import java.util.Scanner;

public class greeting {

public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = in.nextLine();
    String str = greet(name);
    System.out.println("Hello " + str );
}


    static String greet(String name)
    {
        return "How are you!!" + name;
    }
}
