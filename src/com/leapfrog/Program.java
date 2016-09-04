/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog;

import com.leapfrog.iofactorypattern.DosCommand;
import com.leapfrog.iofactorypattern.DosCommandFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lenovo
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       String line="";
       try{
           System.out.println(">");
       while(!(line=reader.readLine()).equalsIgnoreCase("exit")){
           System.out.println(">");
           String[] tokens=line.split(" ");
           DosCommand cmd=DosCommandFactory.get(tokens[0]);
           if(cmd!=null){
               cmd.execute(tokens);
           }
           else{
               System.out.println("command not fount");
           }
           
           
       }
       
       
       }
       catch(IOException ioe){
           System.out.println(ioe.getMessage());
           
       }
    }
    
}
