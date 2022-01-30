package com.company.sockets;

import java.io.*;
import java.net.*;

/* hello ,user frist run Server thane run Client */

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s =new Socket("localhost",888);
            InputStream inStr = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inStr));
            String receivedMessage = br.readLine();
            System.out.println("Message : " +receivedMessage);
            br.close();
            s.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
