// EXERCISE PAGE 54 of 722 (p. 20)

public class Suffle1 {
        public static void main (String[] args) {

        int x = 3;
        while (x > 0) {

            if (x > 2) {
                System.out.print("a");
            }

            x = x - 1;
            System.out.print("-"); 
                        
            if (x == 2) {
                System.out.print("b c");
            }

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        } // end While
    } // end main Class
} // end Class