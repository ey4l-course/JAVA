import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age;
        System.out.println("Hello guest, What is your age?");
        age = s.nextInt();
        System.out.printf("Well, it seems that next year you'll be %d yo", age+1);
    }
}
