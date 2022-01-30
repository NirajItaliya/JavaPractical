package com.company;

import java.net.*;

public class Ad_java_1 {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("google.com");
            System.out.println("IP_" + ip );
            System.out.println("\n");
            InetAddress AddressList[] = InetAddress.getAllByName("www.youtube.com");
            for(int i =0; i <AddressList.length;i++ ){
                System.out.println(AddressList[i]);
            }


        } catch (UnknownHostException e) {
            System.out.println(" Unkonw" + e);
        }
        try {
            System.out.println("\n");
            URL url = new  URL("https://www.youtube.com/watch?v=o-7b6ctrQX0&list=RDMMo-7b6ctrQX0&start_radio=1");
            System.out.println("Protocol :  " + url.getProtocol());
            System.out.println("Host :  " + url.getHost());
            System.out.println("Prot :  " + url.getPort());
            System.out.println("File :  " + url.getFile());
            System.out.println("Authority :  " + url.getAuthority());
            System.out.println("Path :  " + url.getPath());
        } catch (MalformedURLException e) {
            System.out.println(" Unkonw" + e);
        }
    }
}
