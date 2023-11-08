import java.util.Random;
import java.util.Scanner;

public class s_p_s {
    private static String computerChoice;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int st = 1, pa = 2, sc = 3;
        System.out.println(" 1 - stone, 2 - paper, 3 - scissor");
        int user = scanner.nextInt();

        if (user < 1 || user > 3) {
            System.out.println("error");
        } else {
            Random random = new Random();
            int computerIndex = random.nextInt(3);

            
        }
    }
}
