package com.linkshortener;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkShortenerTest {
    @Test
    public void testURLShortening() {
        LinkShortener shortener = new LinkShortener();
        String longURL = "https://www.example.com/very/long/url";
        
        String shortURL = shortener.shortenURL(longURL);
        assertNotNull(shortURL);
        assertEquals(8, shortURL.length());
        
        String expandedURL = shortener.expandURL(shortURL);
        assertEquals(longURL, expandedURL);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidShortURL() {
        LinkShortener shortener = new LinkShortener();
        shortener.expandURL("invalidurl");
    }
}
