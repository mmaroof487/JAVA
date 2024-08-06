
public class SumEvenNumbers {
 public static void main(String[] args) {
        int number = 10; // Example number
        int sum = 0;
        int i = 1;

        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        } while (i <= number);

        System.out.println("Sum of even numbers from 1 to " + number + " is: " + sum);
    }
}
