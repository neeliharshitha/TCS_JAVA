import java.util.*;

public class RiskSeverity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c0 = 0, c1 = 0, c2 = 0;

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if(x == 0) c0++;
            else if(x == 1) c1++;
            else c2++;
        }

        while(c0-- > 0) System.out.print("0 ");
        while(c1-- > 0) System.out.print("1 ");
        while(c2-- > 0) System.out.print("2 ");
    }
}