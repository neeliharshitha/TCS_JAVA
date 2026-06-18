import java.util.*;

public class PriorElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1; 

        for(int i = 1; i < N; i++) {
            boolean flag = true;

            for(int j = 0; j < i; j++) {
                if(arr[i] <= arr[j]) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                count++;
            }
        }

        System.out.println(count);
    }
}