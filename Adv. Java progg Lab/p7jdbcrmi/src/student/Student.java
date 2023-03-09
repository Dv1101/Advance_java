import java.rmi.Remote;
import java.sql.*;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author Dhruv Varia
 */
public interface Student extends Remote
{
    public abstract ArrayList insert(int id,String name,String branch,int atd) throws Exception;  
}
