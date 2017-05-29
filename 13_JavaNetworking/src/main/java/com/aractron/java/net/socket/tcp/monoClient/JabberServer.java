package com.aractron.java.net.socket.tcp.monoClient;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by user on 01/03/2017.
 */
public class JabberServer {

    // Choose a port outside of the range 0-1023:
    public static final int PORT = 8080;

    public static void main(String args[]) throws IOException {
        ServerSocket s = new ServerSocket(PORT);
        System.out.println("Started: " + s);

        try { // Blocks until a connection occurs:
            Socket socket = s.accept();
            try {
                System.out.println("Connection accepted: " + socket);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                // Output is automatically flushed by PrintWriter:
                PrintWriter out = new PrintWriter(
                        new BufferedWriter(
                                new OutputStreamWriter(socket.getOutputStream())), true);
                while (true) {   // main server response
                    String str = in.readLine();
                    if (str.equals("END")) break;
                    System.out.println("Echoing: " + str);
                    out.println(str);
                }
                // Always close the two sockets...
            } finally {
                System.out.println("closing...");
                socket.close();
            }
        } finally {
            s.close();
        }
    }
}



