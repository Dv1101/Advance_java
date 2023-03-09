import java.net.*;
import java.io.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dhruv
 */
public class client 
{
    public static void main(String[] args) 
    {
        try{
           InetAddress ip= InetAddress.getLocalHost();
            Socket s=new Socket(ip,4021);    
            //"192.168.1.47"
         
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
            PrintStream ps=new PrintStream(s.getOutputStream());
            
            
            System.out.print("write something : ");
            String str=kb.readLine();
     
            String str1;
               while(!(str.equals("exit"))) 
               {
                    ps.println(str);
                    str1=br.readLine();
                    System.out.println(str1);
                    System.out.print("write something : ");
                    str=kb.readLine();
          }
            ps.close();
            br.close();
            kb.close();
            s.close();
            System.out.println("client program ended");     
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
}


    
