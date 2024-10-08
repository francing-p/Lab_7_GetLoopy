import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Random dieRoll = new Random();
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String cont = "";
        int count=1;

        System.out.printf("%2s%7s%7s%7s%7s","Roll","Die1","Die2","Die3","Sum\n");
        System.out.printf("--------------------------------%n"); // %n creates a new line . since printf was used, have to use this as an argument instead of \n since there are no other arguments
        do {
            do {
                int roll = dieRoll.nextInt(1, 7);
                int secondRoll = dieRoll.nextInt(1, 7);
                int thirdRoll = dieRoll.nextInt(1, 7);
                int sum = roll + secondRoll + thirdRoll;
                System.out.printf("%2d%7d%7d%7d%7d", count,roll,secondRoll,thirdRoll,sum);
                System.out.println();
                if ((roll == secondRoll) && (roll == thirdRoll)) {
                    done = true;
                    count=count+1;
                    System.out.print("Would you like to continue? [Y/N] ");
                    if (in.hasNextLine()){
                        cont = in.nextLine();
                        count=1;
                        if (cont.equalsIgnoreCase("Y")){ // resets table header if continuing
                            System.out.printf("%2s%7s%7s%7s%7s","Roll","Die1","Die2","Die3","Sum\n");
                            System.out.printf("--------------------------------%n");
                        }
                    }
                }
                else{
                    count=count+1;
                }

            }
            while(cont.equalsIgnoreCase("Y"));
        }
        while(!done);



    }
}
