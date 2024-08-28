import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class LinkShortener {

    private Map<String, String> urlMap;
    private Map<String, String> reverseMap;

    public LinkShortener() {
        this.urlMap = new HashMap<>();
        this.reverseMap = new HashMap<>();
    }

    // Function to shorten a long URL
    public String shortenURL(String longURL) {
        if (urlMap.containsKey(longURL)) {
            return urlMap.get(longURL);
        }

        String shortURL = generateShortURL();
        while (reverseMap.containsKey(shortURL)) {
            shortURL = generateShortURL();
        }

        urlMap.put(longURL, shortURL);
        reverseMap.put(shortURL, longURL);
        return shortURL;
    }

    // Function to expand a short URL
    public String expandURL(String shortURL) {
        return reverseMap.getOrDefault(shortURL, "Invalid short URL");
    }

    // Simple hash function to generate a short URL
    private String generateShortURL() {
        return UUID.randomUUID().toString().substring(0, 6);
    }

    public static void main(String[] args) {
        LinkShortener linkShortener = new LinkShortener();
        CLI cli = new CLI(linkShortener);
        cli.run();
    }
}