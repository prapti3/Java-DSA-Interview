package Function;

public class Parameter {

    static String myGreet(String name){
        return "Hello"+ name;
    }

    public static void main(String[] args){
        String Greet = myGreet("Prapti");
        System.out.println(Greet);
    }
}
