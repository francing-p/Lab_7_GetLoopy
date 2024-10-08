public class PartB {
    public static void main(String[] args) {
        // task five
        for(int row=1; row<=5; row++){
            for(int column = 1; column <=row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // task six
        for(int row=4; row>=0; row--){
            for(int column=0; column<=row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // task seven
        for(int row=1; row<=5; row++){
            for(int column=1; column<=5; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
