package com.company.AJ_Practical;


import com.company.General;

import java.io.*;
import java.net.*;
import java.util.Date;

public class MyServer3 {
    public static void main(String args[])
    {
        try
        {
            General.Date("3");
            ServerSocket ss=new ServerSocket(777);
            Socket s=ss.accept();

            BufferedReader br=new BufferedReader(new
                    InputStreamReader(System.in));
            OutputStream os=s.getOutputStream();
            PrintWriter pw=new PrintWriter(os,true);
            InputStream is=s.getInputStream();
            BufferedReader br1=new BufferedReader(new InputStreamReader(is));
            String str,str1;
            while(true)
            {
                if((str=br1.readLine())!=null)
                {
                    System.out.println(str);
                }
                str1=br.readLine();
                pw.println(str1);
                pw.flush();
            }
        }
        catch(Exception e){}
    }
}
