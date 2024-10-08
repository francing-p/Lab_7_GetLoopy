import java.util.Random; // import Random
import java.util.Scanner; // import Scanner

public class DieRoller {
    public static void main(String[] args) {
        Random dieRoll = new Random(); // new instance of random
        Scanner in = new Scanner(System.in); // new instance of scanner
        // define variables
        boolean done = false;
        String cont = "";
        int count=1;

        // make the header using string format
        System.out.printf("%2s%7s%7s%7s%7s","Roll","Die1","Die2","Die3","Sum\n");
        System.out.printf("--------------------------------%n"); // %n creates a new line . since printf was used, have to use this as an argument instead of \n since there are no other arguments
        do { // outer loop that causes to continue when user says 'y' or 'Y'
            do { // loop until getting a triple
                int roll = dieRoll.nextInt(1, 7); // first roll
                int secondRoll = dieRoll.nextInt(1, 7); // second roll
                int thirdRoll = dieRoll.nextInt(1, 7); // third roll
                int sum = roll + secondRoll + thirdRoll; // sum of the current roll
                System.out.printf("%2d%7d%7d%7d%7d", count,roll,secondRoll,thirdRoll,sum);
                System.out.println(); // print next roll on a new line
                if ((roll == secondRoll) && (roll == thirdRoll)) { // if a triple has been rolled (if A=B and A=C, A=B=C)
                    done = true; // stop rolling
                    count=count+1; // keep counter of how many rolls have occurred
                    System.out.print("Would you like to continue? [Y/N] ");
                    if (in.hasNextLine()){
                        cont = in.nextLine();
                        count=1; // reset count for the next table
                        if (cont.equalsIgnoreCase("Y")){ // resets table header if continuing
                            System.out.printf("%2s%7s%7s%7s%7s","Roll","Die1","Die2","Die3","Sum\n");
                            System.out.printf("--------------------------------%n");
                        }
                    }
                }
                else{
                    count=count+1; // keep counter of how many rolls have occurred
                }

            }
            while(cont.equalsIgnoreCase("Y")); // 'y' or 'Y' is accepted
        }
        while(!done); // while not done, continue the entire loop



    }
}
