import java.util.Scanner;
public class Number{
    public static void Game(){
        Scanner sc= new Scanner(System.in);
        int number=1+(int)(100*Math.random());

        int k=5;
        System.out.println("A number between 1 and 100 is chosen..");
        System.out.println("You have " + k + " attempts left to guess the Correct number...");


        for (int i=0;i<k;i++){
            System.out.println("Enter your Guess: ");
            int guess = sc.nextInt();


            if(guess==number){
                System.out.println("Congratulations!!!! You have found the Number......");
                sc.close();
            
            return;
            }

            else if (guess<number){
                System.out.println("The correct Number is Larger than you guessed!!!!!!");
            }
            else{
                System.out.println("The Correct Number is Less than you guessed!!!!!");
            }
        }
        System.out.println("Oops!!! You Ran out of attempts.......The Correct Answer was:"+number);
        sc.close();


        }
        public static void main(String [] args){
            Game();
        }

    }

    