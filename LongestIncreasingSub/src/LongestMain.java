import java.util.Scanner;
public class LongestMain {

    public static void main(String[] args) {

        int n;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: (must be less or equal to 100: ");
            n = scan.nextInt();
        }
        if(n>100) {
            throw new IllegalArgumentException("value is out of range. Must be <100.");
        }

        LongestIncreasingSub lm = new LongestIncreasingSub(n);
        lm.randomArrayInt();
        lm.longest();

    }

}
