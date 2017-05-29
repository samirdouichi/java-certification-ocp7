package com.aractron.java.net.socket.tcp.multiClient;



import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by user on 01/03/2017.
 */
public class MultiJabberServer {
    static final int PORT = 8080;
    public static void main(String[] args)   throws IOException {
        ServerSocket s = new ServerSocket(PORT);
        System.out.println("Server Started");
        try {
            while(true) {
                // wait for a connection established:
                Socket socket = s.accept();
                try { new ServeOneJabber(socket).start(); }
                catch(IOException e) {
                    // If it fails, close the socket, otherwise the thread will close it:
                    socket.close();   }
            }
        } finally { s.close(); }
    }  }
