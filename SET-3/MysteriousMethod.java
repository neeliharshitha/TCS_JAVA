import java.util.*;

public class MysteriousMethod {
    
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int R = sc.nextInt();

        if (R == 0) {
            System.out.println(0);
            return;
        }

        int sum = digitSum(N);
        int result = sum * R;

        while (result >= 10) {
            result = digitSum(result);
        }

        System.out.println(result);
    }
}