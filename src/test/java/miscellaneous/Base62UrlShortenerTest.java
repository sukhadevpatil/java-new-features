package miscellaneous;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Base62UrlShortenerTest {
    private Base62UrlShortener shortener;

    @BeforeEach
    void setUp() {
        shortener = new Base62UrlShortener();
    }

    @Test
    void shortenUrlReturnsShortCodeForNewUrl() {
        String longUrl = "https://example.com";
        String shortUrl = shortener.shortenUrl(longUrl);
        Assertions.assertNotNull(shortUrl);
        Assertions.assertFalse(shortUrl.isEmpty());
    }

    @Test
    void shortenUrlReturnsSameShortCodeForSameUrl() {
        String longUrl = "https://example.com";
        String firstShort = shortener.shortenUrl(longUrl);
        String secondShort = shortener.shortenUrl(longUrl);
        Assertions.assertEquals(firstShort, secondShort);
    }

    @Test
    void getLongUrlReturnsOriginalUrlForShortCode() {
        String longUrl = "https://example.com";
        String shortUrl = shortener.shortenUrl(longUrl);
        String retrievedUrl = shortener.getLongUrl(shortUrl);
        Assertions.assertEquals(longUrl, retrievedUrl);
    }

    @Test
    void encodeAndDecodeAreInverseOperations() {
        long id = 123456789L;
        String encoded = shortener.encode(id);
        long decoded = shortener.decode(encoded);
        Assertions.assertEquals(id, decoded);
    }

    @Test
    void decodeReturnsZeroForEmptyString() {
        long decoded = shortener.decode("");
        Assertions.assertEquals(0L, decoded);
    }

    @Test
    void getLongUrlReturnsNullForUnknownShortCode() {
        String unknownShort = "abc123";
        String result = shortener.getLongUrl(unknownShort);
        Assertions.assertNull(result);
    }

    @Test
    void shortenUrlHandlesMultipleUniqueUrls() {
        String url1 = "https://a.com";
        String url2 = "https://b.com";
        String short1 = shortener.shortenUrl(url1);
        String short2 = shortener.shortenUrl(url2);
        Assertions.assertNotEquals(short1, short2);
        Assertions.assertEquals(url1, shortener.getLongUrl(short1));
        Assertions.assertEquals(url2, shortener.getLongUrl(short2));
    }
}

