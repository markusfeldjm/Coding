import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    
    Scanner scnr = new Scanner(System.in);
    Random rand = new Random();
    

    public void guess(){
        int correctNum = rand.nextInt(101);
        
        boolean correct = false;

        int number = scnr.nextInt();
        while(correct == false){ //will keep looping until the number equals the correct number and then it will stop

            if(number < correctNum){ //if the number is lower than the correct number, it will return false
                System.out.println("Number is too low. Guess Higher");
                correct = false;
                number = scnr.nextInt();
            }
            else if(number > correctNum){ //if the number is higher than the correct number, it will return false
                System.out.println("Number is too high. Guess Lower");
                correct = false;
                number = scnr.nextInt();
            }
            //if the number equals the correct number, it will return true
            else{
                System.out.println("Congratulations. That is the correct number!");
                System.out.println("The number was " + correctNum + '.');
                correct = true;
            }
        }
    }

    public static void main(String[] args){
        NumberGuess num = new NumberGuess();
        
        System.out.println("Welcome to the number guessing game!");
        System.out.println("Input a number ranging from 0-100.");
        num.guess();
        System.out.println("Thank you for playing.");
    }
}
