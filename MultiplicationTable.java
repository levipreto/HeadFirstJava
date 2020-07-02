public class MultiplicationTable {

    public static void main (String[] args) {
    int table = 5;
    int multiply;

        for (multiply = 0; multiply <= 10; multiply++) {
            System.out.printf("%d * %d = %d", table, multiply, table * multiply).println();
        }
    }
}