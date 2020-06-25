package HeadFirst;

public class Beersong {
        public static void main (String[] args) {
        int beerNum = 100;
        String word = "bottles";
        
        while (beerNum > 0) {
            
            beerNum = beerNum - 1;

            if (beerNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            } // end else
        } // end while
    } // end main method
} // end class