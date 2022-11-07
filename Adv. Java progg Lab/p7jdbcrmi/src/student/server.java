import java.rmi.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dhruv Varia
 */
public class server 
{
  public static void main(String args[]) throws Exception
{
Student1 obj=new studentc();
Naming.rebind("stinfo",obj);
System.out.println("Server Started");
}  
}
