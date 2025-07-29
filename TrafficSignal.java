import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the character input
        String input = scanner.nextLine().trim().toUpperCase();

        switch (input) {
            case "R":
                System.out.println("Stop");
                break;
            case "Y":
                System.out.println("Ready");
                break;
            case "G":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Signal");
        }

        scanner.close();
    }
}
