package com.aractron.java.exception.handle;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by user on 27/02/2017.
 */
public class SingleException {

    private int qty;
    String qtyFromForm;
    private String str;
    private String filePath;
    private int charcount;

    public void getQuantityFromForm() {

        String s = getQtyFromForm();
        try {
            // Might throw NumberFormatException
            qty = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            // Handle the exception
        }
// If no exceptions were thrown, we end up here

    }

    public void getConnection() {

        try { // Might throw MalformedURLException
            URL u = new URL(str);
            // Might throw IOException
            URLConnection c = u.openConnection();
        } catch (MalformedURLException e) {
            System.err.println("Could not open URL: " + e);
        } catch (IOException e) {
            System.err.println("Could not connect: " + e);
        }

    }

    public void getFile() {

        FileInputStream f = null;

        try {
            f = new FileInputStream(filePath);
            while (f.read() != -1)
                charcount++;
        } catch (IOException e) {
            System.out.println("Error accessing file " + e);
        } finally {
            // This block is always executed  f.close();}

        }
    }

    public String getQtyFromForm() {

        return qtyFromForm;
    }
}