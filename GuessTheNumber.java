import java.util.Scanner;

class GuessTheNumber{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int randomNumber = (int)((Math.random())*100);
            int i=0, c=0, numberOfRoundsWon = 0;
            
            System.out.println("There are 3 rounds. You need to win at least 2 rounds to win the game");
            for(int j=1;j<4;j++){
                System.out.println("Round "+j);
                System.out.println("Guess the two-digit number within 5 attempts");
                for(i=0;i<5;i++){
                    int userGuess = sc.nextInt();
                    if(userGuess==randomNumber){
                        c++;
                        break;
                    }
                    else if(userGuess>randomNumber){
                        System.out.println("Guessed number is greater");
                        System.out.println("Guess smaller number");
                        
                    }
                    else{
                        System.out.println("Guessed number is smaller");
                        System.out.println("Guess greater number");
                        
                    }

                }
                if(c==0){
                    System.out.println("You won round "+j);
                    numberOfRoundsWon++;
                    break;
                }
                else{
                    System.out.println("You lost round "+j);
                }
                // if(i==5){
                //     System.out.println("You Lost");
                // }
                // else{
                //     System.out.println("Congrats, You Won");
                // }
            }
            if(numberOfRoundsWon>=2){
                System.out.println("Congrats, You Won");
            }
            else{
                System.out.println("You Lose, try again");
            }
        }
    }
}
