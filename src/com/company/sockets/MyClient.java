package com.company.sockets;

import com.company.General;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/* hello ,user frist run Server thane run Client */

public class MyClient {
    public static void main(String args[]) throws Exception
    {
        General.Date("1");
        Socket s=new Socket("localhost",777);
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(br.readLine());
    }
}
