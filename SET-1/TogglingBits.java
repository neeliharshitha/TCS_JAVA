import java.util.Scanner;

public class TogglingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int mask = 0;
        int temp = n;

        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        int result = n ^ mask;

        System.out.println(result);

        sc.close();
    }
}