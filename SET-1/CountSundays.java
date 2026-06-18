import java.util.Scanner;

public class CountSundays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.next();
        int n = sc.nextInt();

        int startDay = 0;

        switch(day.toLowerCase()) {
            case "sun":
                startDay = 0;
                break;
            case "mon":
                startDay = 1;
                break;
            case "tue":
                startDay = 2;
                break;
            case "wed":
                startDay = 3;
                break;
            case "thu":
                startDay = 4;
                break;
            case "fri":
                startDay = 5;
                break;
            case "sat":
                startDay = 6;
                break;
        }

        int count = 0;

        
        for (int i = 0; i < n; i++) {
            if ((startDay + i) % 7 == 0) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}