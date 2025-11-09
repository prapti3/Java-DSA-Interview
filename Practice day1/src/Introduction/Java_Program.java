package Introduction;
import java.util.Scanner;

public class Java_Program {
    public static void main(String[] args){
        System.out.println("Hello world!!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        System.out.println("Your number is : " + num);
        System.out.println(sc.next());

    }
}
