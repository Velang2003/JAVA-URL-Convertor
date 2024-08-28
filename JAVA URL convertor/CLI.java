import java.util.Scanner;

public class CLI {

    public LinkShortener linkShortener;
    private Scanner scanner;

    public CLI(LinkShortener linkShortener) {
        this.linkShortener = linkShortener;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("1. Shorten URL");
            System.out.println("2. Expand URL");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    shortenURL();
                    break;
                case 2:
                    expandURL();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private void shortenURL() {
        System.out.print("Enter the long URL: ");
        String longURL = scanner.nextLine();
        String shortURL = linkShortener.shortenURL(longURL);
        System.out.println("Short URL: " + shortURL);
    }

    private void expandURL() {
        System.out.print("Enter the short URL: ");
        String shortURL = scanner.nextLine();
        String longURL = linkShortener.expandURL(shortURL);
        System.out.println("Long URL: " + longURL);
    }
}