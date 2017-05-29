package com.aractron.java.net.socket.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * Created by user on 01/03/2017.
 */
public class ParseURL {
    public static void main(String[] args) throws Exception {
        URL aURL = new URL("http://java.sun.com:80/docs/books/"
                + "tutorial/index.html#DOWNLOADING");
        System.out.println("protocol = " + aURL.getProtocol());
        System.out.println("host = " + aURL.getHost());
        System.out.println("filename = " + aURL.getFile());
        System.out.println("port = " + aURL.getPort());
        System.out.println("ref = " + aURL.getRef());

        //Reading from a URL

        URL yahoo = null;
        try {
            yahoo = new URL("https://www.yahoo.com/");
        } catch (MalformedURLException e) {// new URL() failed
            e.printStackTrace();
        } catch (IOException e) {               // openConnection() failed

        }
        BufferedReader in = new BufferedReader(new InputStreamReader(yahoo.openStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();


        //Ecrire dans une URL
       /* String stringToReverse = URLEncoder.encode(args[0]);
        URL url = new URL("http://java.sun.com/cgi-bin/backwards");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        PrintWriter out = new PrintWriter(
                connection.getOutputStream());
        out.println("string=" + stringToReverse);
        out.close();

        BufferedReader input = new BufferedReader(new InputStreamReader(
                connection.getInputStream()));
        String inputLineW = "true";
        while ((inputLine = input.readLine()) != null) System.out.println(inputLineW);
        in.close();
*/

    }
}

