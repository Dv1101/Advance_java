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
public class server 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        try{
            ServerSocket ss=new ServerSocket(4021);
            System.out.println("Wating for client to connect");
            Socket s=ss.accept();
            System.out.println("connection established");
         
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
            PrintStream ps=new PrintStream(s.getOutputStream());
            
            String str,str1;
            str=br.readLine();//read frm client   
              while(str!=null)
               {
                    System.out.println(str);//reads frm client n writes on server
                    System.out.print("Write something  : ");
                    str1=kb.readLine();
                    ps.println(str1);
                    
                    str=br.readLine();//reads frm client
               }
            ps.close();
            br.close();
            kb.close();
            s.close();
            ss.close();          
        }
        catch(IOException e)   
        {
            System.out.println(e);
        }  

    }
}
    


    
