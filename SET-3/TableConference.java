import java.util.*;

public class TableConference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long fact = 1;

        for(int i = 1; i <= n - 1; i++) {
            fact *= i;
        }

        long result = 2 * fact;

        System.out.println(result);
    }
}