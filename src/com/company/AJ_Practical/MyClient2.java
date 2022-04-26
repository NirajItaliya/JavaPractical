package com.company.AJ_Practical;

import com.company.General;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/* hello ,user frist run Server thane run Client */

public class MyClient2 {
    public static void main(String args[]) throws Exception
    {
        General.Date("2");
        Socket s=new Socket("localhost",777);
        PrintStream ps=new PrintStream(s.getOutputStream());
        int arr[]={10,20,30,40,50};
        for(int i=0;i<=4;i++)
        {
            ps.println(""+arr[i]);
        }
        InputStream is=s.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        String str;
        while((str=br.readLine())!=null)
        { System.out.println("The Sum is:"+str); }
        ps.close();
        s.close();
    }
}
