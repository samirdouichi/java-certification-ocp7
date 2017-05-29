package com.aractron.java.net.socket.tcp.multiClient;



import java.io.IOException;
import java.net.InetAddress;

/**
 * Created by user on 01/03/2017.
 */
public class MultiJabberClient {
    static final int MAX_THREADS = 40;

    public static void main(String[] args)
            throws IOException, InterruptedException {
        InetAddress addr =
                InetAddress.getByName(null);
        while (true) {
            if (JabberClientThread.threadCount() < MAX_THREADS)
                new JabberClientThread(addr);
            Thread.currentThread().sleep(100);  // Why not just sleep(100)?
        }
    }
}
