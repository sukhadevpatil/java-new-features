package miscellaneous;

public class Base62UrlShortenerDemo {
    public static void main(String[] args) {
        Base62UrlShortener shortener = new Base62UrlShortener();
        String longUrl = "https://www.example.com/some/long/path";
        String shortUrl = shortener.shortenUrl(longUrl);
        System.out.printf("Shortened URL: %s%n", shortUrl); // e.g., 0000007
        String originalUrl = shortener.getLongUrl(shortUrl);
        System.out.printf("Original URL: %s%n", originalUrl); // https://www.example.com/some/long/path
    }
}

