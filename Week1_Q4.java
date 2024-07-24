import java.util.Scanner;

public class Week1_Q4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        int temp = reader.nextInt();
        
        if (temp > 30) {
            System.out.println("Hot");
        } else if (temp >= 20) {
            System.out.println("It's warm");
        } else if (temp >= 10) {
            System.out.println("It's Cold");
        } else {
            System.out.println("It's very Cold");
        }
    }
}
