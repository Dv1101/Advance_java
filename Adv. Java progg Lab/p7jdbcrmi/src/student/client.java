import java.rmi.*;
import java.sql.*;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dhruv Varia
 */
public class client {
    public static void main(String args[]) throws Exception
{
Scanner scan= new Scanner(System.in);
System.out.println("Enter id,name,branch,attendance for student:");
int id=scan.nextInt();
String name=scan.next();
String branch=scan.next();
int atd=scan.nextInt();
Student1 obj=(Student1)Naming.lookup("stinfo");
ArrayList ar=obj.insert(id,name,branch,atd);
Iterator it=ar.iterator();
System.out.println("Id\tName\tBranch\tAttendance");
System.out.println(it.next()+"\t"+it.next()+"\t"+it.next()+"\t"+it.next()+"\t");
}

