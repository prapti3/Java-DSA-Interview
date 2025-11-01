package Conditional_Loops;

public class Main {
    public static void main(String[] args){
        int salary = 25400;
//        if(salary > 10000){
//            salary = salary +2000;
//        }
//        else{
//            salary += 1000;
//        }
//        System.out.println(salary);

//        multiple if-else
        if(salary >10000){
            salary +=2000;
        }
        else if(salary > 2000){
            salary += 3000;
        }
        else{
            salary += 400;

        }
        System.out.println(salary);
    }
}
