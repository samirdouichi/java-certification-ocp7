package com.aractron.java.net.socket.tcp.monoClient;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by user on 01/03/2017.
 */
public class JabberClient {

    public static void main(String args[]) throws IOException {
        // "Local Loopback" IP address:
        InetAddress addr = InetAddress.getByName(null);
        System.out.println("addr = " + addr);
        // Unlike ServerSocket, client needn’t specify its local port, which is allocated dynamically by machine.
        Socket socket = new Socket(addr, JabberServer.PORT);
        // Guard everything in a try-finally to make sure that the socket is closed:
        try {
            System.out.println("socket = " + socket);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            // Output is automatically flushed by PrintWriter:
            PrintWriter out = new PrintWriter(new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())), true);

            for (int i = 0; i < 10; i++) {
                out.println("sending " + i);
                String str = in.readLine();
                System.out.println(str);
            }
            out.println("END");
        } finally {
            System.out.println("closing...");
            socket.close();
        }
    }
}


