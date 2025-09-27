package miscellaneous;

import java.util.HashMap;
import java.util.Map;

public class Base62UrlShortener {
    private static final String BASE62 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int BASE = 62;
    private long id = 7;
    private final Map<Long, String> idToUrl = new HashMap<>();
    private final Map<String, Long> urlToId = new HashMap<>();

    public String shortenUrl(String longUrl) {
        if (urlToId.containsKey(longUrl)) {
            return encode(urlToId.get(longUrl));
        }
        idToUrl.put(id, longUrl);
        urlToId.put(longUrl, id);
        return encode(id++);
    }

    public String getLongUrl(String shortUrl) {
        long id = decode(shortUrl);
        return idToUrl.get(id);
    }

    public String encode(long num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(BASE62.charAt((int) (num % BASE)));
            num /= BASE;
        }
        String base62 = sb.reverse().toString();
        // Pad to 7 characters with leading '0's if necessary
        while (base62.length() < 7) {
            base62 = "0" + base62;
        }
        return base62;
    }

    public long decode(String str) {
        // Remove leading '0's for decoding
        String trimmed = str.replaceFirst("^0+", "");
        long num = 0;
        for (int i = 0; i < trimmed.length(); i++) {
            num = num * BASE + BASE62.indexOf(trimmed.charAt(i));
        }
        return num;
    }
}
