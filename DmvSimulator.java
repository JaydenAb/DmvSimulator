import java.util.Random;

public class DmvSimulator {

    public static void main(String[] args) {
        welcomeUser();
        int userNumber = generateRandomNumber();
        System.out.println("Your number is: " + userNumber);
        simulateDMV(userNumber);
    }

    private static void welcomeUser() {
        System.out.println("Welcome to the DMV!");
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Generates a random number between 1 and 100
    }

    private static void simulateDMV(int userNumber) {
        System.out.println("Please wait until your number is called.");

        // Simulate calling out numbers
        for (int i = userNumber + 1; i <= 100; i++) {
            System.out.println("Number " + i + ", please proceed.");
        }

        // Wrap around to the beginning
        for (int i = 1; i < userNumber; i++) {
            System.out.println("Number " + i + ", please proceed.");
        }

        // Notify the user they don't have required paperwork
        System.out.println("Number " + userNumber + ", we're sorry, but you don't have the required paperwork.");
    }
}