package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {

    private static String LOG_TAG = Config.class.getSimpleName();
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://raw.githubusercontent.com/TNTest/xyzreader/master/data.json" );
        } catch (MalformedURLException ignored) {
            Log.w(LOG_TAG, ignored.getMessage(), ignored);
        }

        BASE_URL = url;
    }
}
