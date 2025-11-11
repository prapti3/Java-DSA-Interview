package Set2;

public class Operators {
    public static void main(String[] args){
        //Arithmatic

        int a =4;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(++a);
        System.out.println(a--);



        //Assignment

        int c = a;
        System.out.println(c);
        c += 1;
        System.out.println("+= "+ c);
        c-=2;
        System.out.println("-= "+ c);
        c *= 3;
        System.out.println("*= " + c);
        c /= 4;
        System.out.println(c);



        //comparison operator
//
//        int x =1;
//        while(x < 5){
//            System.out.println("True");
//            x++;
//        }

//        if(x == 3){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }
////
//        if(x >= 3){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }

//        if(x <= 10){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }


//logical operators

        int x =5;
        int y = 10;

        if(x <= 10 && y < 20){
            System.out.println("ttyyy");
        }

        if(x != 10){
            System.out.println("Yes");
        }



    }
}
