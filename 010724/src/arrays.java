import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        String[] str = {"on", "your", "existing", "Java", "project"};
        int[] nums = {1, 5, 10, 423, 94};
        for (int i = 0; i < str.length; i++){
            System.out.printf("%d   %s   %3d\n", i, str[i], nums[i]);
        }
        int num = (int) (Math.random() * 5) + 1;
        str[num] = "NEW";
        nums[num] = 999;
        System.out.printf("------->Element no. %d of both arrays is replaced<-----\n", num);
        for (int i = 0; i < str.length; i++){
            System.out.printf("%d   %s   %3d\n", i, str[i], nums[i]);
        }
    }
}
