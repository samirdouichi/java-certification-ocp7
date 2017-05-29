package com.aractron.java.net.socket.udp;

/**
 * Created by user on 01/03/2017.
 */
// Client that sends and receives packets to/from a server.

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JFrame {
    private JTextField enterField;
    private JTextArea displayArea;
    private DatagramSocket socket;

    // set up GUI and DatagramSocket
    public Client() {
        super("Client");
        Container container = getContentPane();
        enterField = new JTextField("Type message here");
        enterField.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        // create and send packet
                        try {
                            displayArea.append("\nSending packet containing: " + event.getActionCommand() + "\n");

                            // get message from textfield and convert to byte array
                            String message = event.getActionCommand();
                            byte data[] = message.getBytes();
                            // create sendPacket
                            DatagramPacket sendPacket = new DatagramPacket(data,
                                    data.length, InetAddress.getLocalHost(), 5000);
                            socket.send(sendPacket); // send packet
                            displayArea.append("Packet sent\n");
                            displayArea.setCaretPosition(displayArea.getText().length());
                        }     // process problems creating or sending packet
                        catch (IOException ioException) {
                            displayMessage(ioException.toString() + "\n");
                            ioException.printStackTrace();
                        }
                    } // end actionPerformed
                } // end inner class
        ); // end call to addActionListener
        container.add(enterField, BorderLayout.NORTH);
        displayArea = new JTextArea();
        container.add(new JScrollPane(displayArea), BorderLayout.CENTER);
        setSize(400, 300);
        setVisible(true);
        // create DatagramSocket for sending and receiving packets
        try {
            socket = new DatagramSocket();
        }
        // catch problems creating DatagramSocket
        catch (SocketException socketException) {
            socketException.printStackTrace();
            System.exit(1);
        }

    } // end Client constructor

    // wait for packets to arrive from Server, display packet contents
    private void waitForPackets() {
        while (true) { // loop forever
            // receive packet and display contents
            try {  // set up packet
                byte data[] = new byte[100];
                DatagramPacket receivePacket = new DatagramPacket(data, data.length);
                socket.receive(receivePacket); // wait for packet
                // display packet contents
                displayMessage("\nPacket received:" +
                        "\nFrom host: " + receivePacket.getAddress() +
                        "\nHost port: " + receivePacket.getPort() +
                        "\nLength: " + receivePacket.getLength() +
                        "\nContaining:\n\t" + new String(receivePacket.getData(),
                        0, receivePacket.getLength()));
            }

            // process problems receiving or displaying packet
            catch (IOException exception) {
                displayMessage(exception.toString() + "\n");
                exception.printStackTrace();
            }
        } // end while
    } // end method waitForPackets

    // utility method called from other threads to manipulate
    // displayArea in the event-dispatch thread
    private void displayMessage(final String messageToDisplay) {    // display message from event-dispatch thread of execution
        SwingUtilities.invokeLater(
                new Runnable() {  // inner class to ensure GUI updates properly
                    public void run()  // updates displayArea
                    {
                        displayArea.append(messageToDisplay);
                        displayArea.setCaretPosition(displayArea.getText().length());
                    }

                }  // end inner class

        ); // end call to SwingUtilities.invokeLater
    }

    public static void main(String args[]) {
        Client application = new Client();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.waitForPackets();
    }

}  // end class Client

