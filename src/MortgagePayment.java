
import java.util.Scanner;

public class MortgagePayment {
    private static final int MONTHS_IN_YEAR = 12;
    private static final double PERCENT = 100;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = scan.nextDouble();
        System.out.print("Enter Rate of Interest (% per year): ");
        double rate = scan.nextDouble();
        rate = (rate / PERCENT) / MONTHS_IN_YEAR;
        System.out.print("Enter Time period in years: ");
        int time = scan.nextInt();
        time = time * 12;
        double payment = (principal * rate) / (1 - Math.pow(1 + rate, -time));

        System.out.println("Monthly Payment: " + payment);
        scan.close();
    }
}

