package Conditional_Loops.Switch_Case;
import java.util.Scanner;

public class switch_case_Statement {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String fruit = in.next();


//        switch (fruit){
//
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruits");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "Graphs":
//                System.out.println("Small fruit");
//                break;
//
//            default:
//                System.out.println("Please enter valid fruit name");
//        }


//        press : alt + enter => switch to enhance
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruits");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Graphs" -> System.out.println("Small fruit");
//            default -> System.out.println("Please enter valid fruit name");
//        }


        int day = in.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Please enter write day");
//        }

        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
