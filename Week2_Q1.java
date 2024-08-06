public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 1000; // Example principal
        double rate = 5; // Example rate
        int years = 5; // Example number of years

        for (int i = 1; i <= years; i++) {
            double interest = (principal * rate * i) / 100;
            System.out.println("Year " + i + ": " + interest);
        }
    }
}
