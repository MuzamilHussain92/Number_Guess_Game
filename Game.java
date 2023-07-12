import java.util.Scanner;
//for taking input imported scanner class
import java.util.Random;
//for generating random number  imported Random class
public class Game {
    int random_number;
    int guess;
    public Game(){
        Random genrate_random=new Random();
         random_number=genrate_random.nextInt(100);
    }
    public int take_input(){
        Scanner input=new Scanner(System.in);
         guess=input.nextInt();
        return guess;
    }
    boolean is_correct(){
        if(this.guess==this.random_number){
            return true;
        }
        else if(this.guess>this.random_number) {
            System.out.println("Number is less than "+guess);
            return false;
        }
        else{
            System.out.println("Number is greater than "+guess);
            return false;
        }
    }
    public static void main(String[] args) {
        Game obj=new Game();
        int chances=4;
        while(chances>0){
            System.out.println("No of Guesses Remaining " +chances);
            System.out.println("Guess the number");
            obj.take_input();
            if (obj.is_correct()){
                System.out.println("you won");
                break;
            } else  {
                System.out.println("Wrong guess");

            }
            chances--;

        }


    }
}
