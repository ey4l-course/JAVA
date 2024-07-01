
public class exersize1 {
    public static void main(String[] args) {
        int num1, num2;
        num1 = (int) (Math.random() * 5) + 1;
        num2 = (int) (Math.random() * 5) + 1;
        System.out.printf("num1 is: %d\nnum2 is: %d\n", num1, num2);
        if (num1 == num2) {
            System.out.println("Num1 equals num2");
        } else {
            System.out.println("Num1 doesn't equal num2");
        }

    }
}
