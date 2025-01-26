package com.linkshortener;

import java.net.URL;

public class URLValidator {
    public static boolean isValidURL(String urlString) {
        try {
            new URL(urlString);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
