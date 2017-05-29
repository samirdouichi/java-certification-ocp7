package com.aractron.java.exception.handle;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by user on 27/02/2017.
 */
public class ThrowsException {

    private int[] values;

    public URL changeURL(URL oldURL) throws MalformedURLException {
        return new URL("http://www.oracle.com");
    }

    public String getValue(int index) throws IndexOutOfBoundsException {
        if (index == 0 || index >= values.length) {
            throw new IndexOutOfBoundsException();
        }
        return null;
    }

}


