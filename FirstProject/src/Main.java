import java.util.Scanner;

public class Main {
    public int foo(){
        Scanner s = new Scanner(System.in);
        String name;
        int yob, currentYear, age;
        double avgGrade;
        char bestGrade;
        boolean isProg;
        System.out.println("enter your name:");
        name = s.next();
        System.out.println("What is your year of birth");
        yob = s.nextInt();
        age = 2024 - yob;
        System.out.println("Enter your average:");
        avgGrade = s.nextDouble();
        System.out.println("Enter your best grade:");
        bestGrade = s.next().charAt(0);
        System.out.println("Specify your gender (m/f)");
        isProg = s.nextBoolean();
        return 0;
    }
    public static void main(String[] args) {

    }
}
