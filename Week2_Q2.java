public class Pattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
