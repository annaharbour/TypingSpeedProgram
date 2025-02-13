import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMProgram {
    static String[] words = {
            "hello",
            "world",
            "java",
            "programming",
            "is",
            "fun",
            "learning",
            "to",
            "code"};

    public static void main(String[] args) throws InterruptedException {
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(words[random.nextInt(8)] + " ");
        }

        System.out.println();
        double start = LocalTime.now().toNanoOfDay();
        Scanner scan = new Scanner(System.in);
        String typedWords = scan.nextLine();
        double end = LocalTime.now().toNanoOfDay();
        double seconds = (end - start) / 100000000.0;
        int numChars = typedWords.length();
        int wpm = (int) ((((double) numChars / 5) / seconds) * 60);
        System.out.println("Your WPM is: " + wpm);
    }
}
