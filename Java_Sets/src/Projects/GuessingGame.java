package Projects;

import java.util.Scanner;

public class GuessingGame {
    public static void guessingNumberGame(){
        Scanner sc = new Scanner(System.in);

        //generate a random number between 1 to 100
        int number = 1 + (int)(100 * Math.random());

        //number of attempts
        int K = 5;

        System.out.println("A number is choosen between 1 and 100");
        System.out.println("You have" + K + "attempts to guess the correct number.");

        //loop for K attempt
        for(int i =0;i<K; i++){
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();

            //check conditions
            if(guess == number){
                System.out.println("Congratulations ! You guessed the correct number.");
                sc.close();
            }

            else if(guess < number){
                System.out.println("The number is grester than " + guess);

            }
            else{
                System.out.println("The number is less than " + guess);
            }

        }

        //if the user runs out of attempts
        System.out.println("You've exhausted all attempts. the correct number was : " + number);
        sc.close();

    }
    public static void main(String[] args){
        guessingNumberGame();
    }

}
