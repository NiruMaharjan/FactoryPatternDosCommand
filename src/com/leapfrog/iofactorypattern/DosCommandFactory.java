/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.iofactorypattern;

/**
 *
 * @author Lenovo
 */
public class DosCommandFactory {
    public static DosCommand get(String cmd){
        if(cmd.equalsIgnoreCase("md")){
            return new MDCommand();
        }
        else if(cmd.equalsIgnoreCase("rd")){
            return new RDCommand();
        }
        else if(cmd.equalsIgnoreCase("ren")){
            return new RenCommand();
        }
        else if(cmd.equalsIgnoreCase("dir")){
            return new DirCommand();
        }
        return null;
    }
    
}
