import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) throws Exception {
        // Hello World
        System.out.println(ANSIColors.RED_BOLD + "Hello World!" + ANSIColors.RESET);
        Utils.sleep(2000);

        // Input 
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSIColors.BLUE + "Enter your name: " + ANSIColors.RESET + ANSIColors.PURPLE_BOLD); 
        String name = scanner.nextLine();
        Utils.sleep(1000);

        // Output
        System.out.println(ANSIColors.YELLOW + "\nWassup, " + ANSIColors.PURPLE_BOLD + name + ANSIColors.YELLOW_BOLD + "!" + ANSIColors.RESET);
        Utils.sleep(2000);

        // Welcome Message
        System.out.println(ANSIColors.GREEN + "Welcome to " + ANSIColors.RED_BACKGROUND + ANSIColors.WHITE_BOLD_BRIGHT + "Java" + ANSIColors.RESET + ANSIColors.GREEN_BOLD_BRIGHT + " Programming!" + ANSIColors.RESET);
        Utils.sleep(2000);

        // Furry Friends
        System.out.println(ANSIColors.RED + "Oh! Looks like we got a bunch of animal friends here!" + ANSIColors.RESET);
        Utils.sleep(2000);

        boolean meetMore = true; // Flag to control the loop
        while (meetMore) {
            System.out.println(ANSIColors.BLUE + "\nWhich furry friend would you like to meet?" + ANSIColors.RESET);
            System.out.println(ANSIColors.YELLOW + "1) Mrs. Milky the Cow\n2) Mr. Barky the Dog\n3) Captain Whiskers the Cat" + ANSIColors.RESET);

            int choice = 0;
            while (true) {
                System.out.print(ANSIColors.GREEN + "Enter your choice: ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline - removes unwanted input like \n
                    if (choice >= 1 && choice <= 3) {
                        break;
                    }
                } else {
                    scanner.nextLine(); // Consume invalid input
                }
                System.out.println(ANSIColors.RED_BACKGROUND_BRIGHT + "Invalid input! Please enter (1/2/3)." + ANSIColors.RESET);
            }

            // Show selected furry friend
            if (choice == 1) {
                System.out.println(ANSIColors.PURPLE_BOLD_BRIGHT + "\nMrs. Milky says happy coding!" + ANSIColors.RESET);
                System.out.println(AsciiArt.CLOUDS);
                System.out.println(AsciiArt.MILKY);
            } else if (choice == 2) {
                System.out.println(ANSIColors.BLUE_BOLD_BRIGHT + "\nMr. Barky says good luck on your OOP class!" + ANSIColors.RESET);
                System.out.println(AsciiArt.CLOUDS);
                System.out.println(AsciiArt.BARKY);
            } else {
                System.out.println("\nCaptain Whishker say Mr. Kasmir is Makassar's sweetest programmer!");
                System.out.println(AsciiArt.CLOUDS);
                System.out.println(AsciiArt.WHISKERS);
            }

            // Ask user if they want to meet another furry friend
            while (true) {
                System.out.print(ANSIColors.GREEN_BOLD + "\nWould you like to meet another furry friend? (Y/N): " + ANSIColors.RESET);
                String response = scanner.nextLine().trim().toUpperCase(); // Convert input to uppercase

                if (response.equals("Y")) {
                    break; // Loop continues for another choice
                } else if (response.equals("N")) {
                    meetMore = false; // Exit loop
                    break;
                } else {
                    System.out.println(ANSIColors.RED_BOLD_BRIGHT + "Invalid response! Please enter 'Y' for Yes or 'N' for No." + ANSIColors.RESET);
                }
            }
        }

        // Quick Fun Fact
        System.out.println(ANSIColors.RED_BOLD_BRIGHT + "\nAlright! Moving on here's a Quick Fun Fact!" + ANSIColors.RESET);
        Utils.sleep(3000);

        String[] fact = FunFactsLibrary.getRandomFunFact();
        System.out.println("\033[3m" + ANSIColors.YELLOW_BOLD_BRIGHT + fact[0] + ANSIColors.RESET); // Italic text from https://www.reddit.com/r/javahelp/comments/shdsbu/is_it_possible_to_print_in_italics_to_the/?rdt=59901
        Utils.sleep(3000);
        System.out.println(ANSIColors.WHITE_BOLD + fact[1] + ANSIColors.RESET); 
        Utils.sleep(5000);

        // Java Version
        System.out.println(ANSIColors.CYAN_BOLD_BRIGHT + "\nJava Version: " + System.getProperty("java.version") + ANSIColors.RESET);
        Utils.sleep(2000);

        // Hehe :>
        System.out.println(AsciiArt.HEHE);

        scanner.close();
    }
}
