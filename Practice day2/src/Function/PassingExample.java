package Function;

public class PassingExample {
    public static void main(String[] args){
        String name = "Kunal";
        greet(name); //argument
    }

    static void greet(String naam){ // naam = parameter
        System.out.println("Hello "  + naam);
    }
}

/*
* Parameter - acts as variables inside the method
* methodName(param)
*
*
* when parameter is passed to method, it is called an argument
*
* */

