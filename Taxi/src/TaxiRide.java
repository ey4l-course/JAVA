import java.util.Scanner;
public class TaxiRide {
    public static double calc(double km, int suitcase){
        final double initPrice = 10.2;
        final double kmPrice = 1.3;
        final double suitcasePrice = 2;
        return initPrice + kmPrice * km + suitcasePrice * suitcase;
    }
    public static void main(String[] args) {
        double mileage;
        int baggage;
        Scanner s = new Scanner(System.in);
        System.out.println("Good morning, please enter mileage:");
        mileage = s.nextDouble();
        System.out.println("And how many suitcases do you have?");
        baggage = s.nextInt();
        System.out.printf("The ride will cost %f NIS", calc(mileage, baggage));
    }
}
