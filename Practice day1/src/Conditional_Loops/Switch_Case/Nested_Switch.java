package Conditional_Loops.Switch_Case;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Kunal");
                break;
            case 2:
                System.out.println("Rahul");
                break;
            case 3:
                System.out.println("Prapti");
                break;
            case 4:
                System.out.println("Hello");
                break;
            case 5:
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management" :
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entered");

                }
            default:
                System.out.println("Enter correct EmpID");
        }


//        better way to write
        switch (empID){
            case 1 -> System.out.println("Prapti chavan");
            case 2 -> System.out.println("Rahul");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department){
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("NO department entered");
                }
            }
            default -> System.out.println("Enter correct EMpID");
        }
    }
}
