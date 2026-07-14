import java.util.*;

class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("~!Let's Play The Number Guessing Game!~");
        for ( ; ;) {
          System.out.println();
          int number = rand.nextInt(1,101);
          System.out.print("I am thinking of a number from 1 to 100. What is it?: ");
          
          for ( ; ;) { 
            int input = sc.nextInt();
            if (input<number) {
                System.out.print("Then Number you guessed is too low. Try Again!: ");
            }
            else if (input>number) {
                System.out.print("The Number you guessed is too high. Try Again !: ");
            }
            else if (input==number) {
                System.out.println("Bingo ! You guessed my number!!!");
                break;
            }
          }//for loop
        
        System.out.print("Enter 0 to Play Again and 1 to Quit: ");
        int again = sc.nextInt();
        if (again==1) {
            System.out.print("Game Exited. Thank You For Playing!!!");
            break;
        }
        else if (again!=1 && again!=0) {
            System.out.print("Incompatible Response. Exiting Game...");
            break;
        }
       
        }
    }
}
    
        

