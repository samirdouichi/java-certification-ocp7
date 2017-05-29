package com.aractron.java.net;

/**
 * Created by user on 01/03/2017.
 */

import java.net.*;

public class WhoAmI {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Usage: WhoAmI MachineName");
            System.exit(1);
        }
        InetAddress a = InetAddress.getByName(args[0]);
        System.out.println(a);
    }
}
