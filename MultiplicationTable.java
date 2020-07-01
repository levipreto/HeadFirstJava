public class MultiplicationTable {

    public static void main (String[] args) {
    int table = 5;
    int multiply = -1;

        while (multiply < 10) {
        
            multiply = multiply + 1;

            System.out.printf("%d * %d = %d", table, multiply, table * multiply).println();
        }
    }
}