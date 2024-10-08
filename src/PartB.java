public class PartB {
    public static void main(String[] args) {
        // task five
        for(int row=1; row<=5; row++){
            for(int column = 1; column <=row; column++){
                System.out.print("* "); // increase from 1 to 5 stars
            }
            System.out.println();
        }

        System.out.println(); // space between code

        // task six
        for(int row=4; row>=0; row--){ //
            for(int column=0; column<=row; column++){
                System.out.print("* "); // decrease from 5 to 1 star
            }
            System.out.println();
        }

        System.out.println(); // space between code

        // task seven
        for(int row=1; row<=5; row++){
            for(int column=1; column<=5; column++){
                System.out.print("* "); // make five stars for each line
            }
            System.out.println();
        }
    }
}
