package Methods;

public class Method {
    /*
    * block of code which only runs when it is called
    * pass data through parameteres
    * perform certain actions
    *
    *
    *
    * static = method belongs to Main class and not an object of Main class.
    *
    * */

    public static void myMethod(){
        System.out.println("Hello");
    }

    public static int myNum(int a, int b){

        int c = a +b;
        return c;
    }

    public static void main(String[] args){
        myMethod();
        int a = 5;
        int b = 3;
        int result = myNum(a,b);
        System.out.println(result);
    }


}


