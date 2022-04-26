package com.company.AJ_Practical;


import com.company.General;

import java.io.*;
import java.net.*;
import java.util.Date;

public class MyServer2 {
    public static void main(String args[]) throws IOException
    {
        General.Date("2");
        ServerSocket ss=new ServerSocket(777);
        Socket s=ss.accept();
        int i,sum=0;
        String str;
        InputStream is=s.getInputStream();
        PrintStream ps=new PrintStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        while((str=br.readLine())!=null)
        {
            System.out.println("The Number Sends by Client is:"+str);
            i=Integer.parseInt(str);
            sum=sum+i;
            ps.println(""+sum);
        }
        ps.close();
        ss.close();
        s.close();
    }
}
