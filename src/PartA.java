public class PartA {
    public static void main(String[] args) {
        // task one
        for(int count=0; count<=30; count++) { // counts upwards from 0 to 30 by one
            System.out.print(count + " "); // added space to make it readable
        }

        System.out.println(); // print next line of code on a new line

        // task two
        for(int count=30; count>=0; count--){ // counts downwards from 30 to 0 by one
            System.out.print(count + " ");
        }

        System.out.println(); // print next line of code on a new line

        // task three
        for(int count=0; count<=18; count+=3){ // counts upwards from 0 to 18 by three
            System.out.print(count + " ");
        }

        System.out.println(); // print next line of code on a new line

        // task four
        for(int count=10; count>=0; count-=2){ // counts downwards from 10 to 0 by two
            System.out.print(count + " ");
        }
    }
}
