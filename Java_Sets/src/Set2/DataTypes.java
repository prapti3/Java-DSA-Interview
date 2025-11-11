package Set2;

public class DataTypes {
    public static void main(String[] args){
        /*
        * Primitive datatype - byte,short,int,long,float,double,boolean and char
        * - predefined and build into lang
        * -cannot call method
        * - start with lower case
        * - holds value always
        *
        *
        *
        *
        * Non-primitive DT - String, Arrays and classes etc
        *
        * */

        int myNum = 3;
        float myFloat = 4.5f;
        char ch = 'D';
        //ASCII Values
        char myVar = 65;
        System.out.println(myVar);
        String greet = "Hello Everyone";
        char currency = '$';


        //Non-Primitve Datatype
        /*
        * - reference types bcz they refer to objects
        * - created by programmer except String
        * - used to call methods
        * - starts with uppercase
        * - holds null value
        *
        *
        *
        * */

        //Var keyword
        /*
        * - introduced in java 10 (2018)
        * - lets compiler automatically detect type of variable based on value assign to it
        * = clear code, avoid repeating type,
        *
        *
        *
        * */



        var x =6;
        System.out.println(x);

    }
}
